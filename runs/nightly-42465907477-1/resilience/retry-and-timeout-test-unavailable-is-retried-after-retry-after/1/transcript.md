# Transcript: A 503 with Retry-After is retried after the wait

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#unavailableIsRetriedAfterRetryAfter` |
| Features | FEAT-RES-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-47391cd7-9beb-4717-a999-427e642ec338` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-f9101637-b3fc-4759-8f31-998073cf7ea9` |
| 3 | `GET /v1/accounts/me` | 503 | 10 | `qa-0a50c721-a2bc-434d-b3ae-c439a8be0b37` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-c9eadf7d-d01c-4118-90db-8e33fd5bee40` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-152f0ec7-25a2-4b7c-8956-e596745fb383` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-4dcd57ee-3411-41c5-9cae-638166d810aa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-47391cd7-9beb-4717-a999-427e642ec338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47391cd7-9beb-4717-a999-427e642ec338
Content-Type: application/json

--- request body ---
{"handle":"qa-3d1e096973b7","displayName":"QA 3d1e096973b7","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-47391cd7-9beb-4717-a999-427e642ec338
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-3d1e096973b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ed6e4e4-7cf0-48fa-875a-085b27f38e77","handle":"qa-3d1e096973b7","displayName":"QA 3d1e096973b7","region":"eu","role":"user","createdAt":"2026-11-08T09:09:12.734522238Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f9101637-b3fc-4759-8f31-998073cf7ea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9101637-b3fc-4759-8f31-998073cf7ea9
Content-Type: application/json

--- request body ---
{"handle":"qa-3d1e096973b7","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9101637-b3fc-4759-8f31-998073cf7ea9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ed6e4e4-7cf0-48fa-875a-085b27f38e77"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a50c721-a2bc-434d-b3ae-c439a8be0b37

--- request headers ---
Accept: application/json
X-Fault-Key: 556bb525-8a32-450e-a554-576bb308af99
X-Fault: unavailable-once
X-Correlation-Id: qa-0a50c721-a2bc-434d-b3ae-c439a8be0b37
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a50c721-a2bc-434d-b3ae-c439a8be0b37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-0a50c721-a2bc-434d-b3ae-c439a8be0b37"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9eadf7d-d01c-4118-90db-8e33fd5bee40

--- request headers ---
Accept: application/json
X-Fault-Key: 556bb525-8a32-450e-a554-576bb308af99
X-Fault: unavailable-once
X-Correlation-Id: qa-c9eadf7d-d01c-4118-90db-8e33fd5bee40
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9eadf7d-d01c-4118-90db-8e33fd5bee40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ed6e4e4-7cf0-48fa-875a-085b27f38e77","handle":"qa-3d1e096973b7","displayName":"QA 3d1e096973b7","region":"eu","role":"user","createdAt":"2026-11-08T09:09:12.734522238Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-152f0ec7-25a2-4b7c-8956-e596745fb383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-152f0ec7-25a2-4b7c-8956-e596745fb383
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-152f0ec7-25a2-4b7c-8956-e596745fb383
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4dcd57ee-3411-41c5-9cae-638166d810aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dcd57ee-3411-41c5-9cae-638166d810aa
Content-Type: application/json

--- request body ---
{"handle":"qa-3d1e096973b7","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4dcd57ee-3411-41c5-9cae-638166d810aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4dcd57ee-3411-41c5-9cae-638166d810aa"}
```
