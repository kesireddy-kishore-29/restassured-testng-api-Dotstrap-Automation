# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 558 | `qa-79165c59-485a-406c-aed5-666932e152f3` |
| 2 | `POST /v1/auth/token` | 200 | 74 | `qa-5109aef0-44d3-4c57-a4de-8e398a86e7da` |
| 3 | `GET /v1/conversations/{id}` | 404 | 87 | `qa-16f78d40-5c55-4a0b-9416-6613612781d9` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 57 | `qa-bde075c4-238b-4b38-8575-d19a96bd79f0` |
| 5 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-198da2f7-1837-48d8-abef-8b833d9faa78` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-990cc494-f142-4b79-81fb-41be9e51c1d2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-79165c59-485a-406c-aed5-666932e152f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79165c59-485a-406c-aed5-666932e152f3
Content-Type: application/json

--- request body ---
{"handle":"qa-6a68523da281","displayName":"QA 6a68523da281","password":"****","region":"eu"}

--- response: 201 in 558 ms ---
Date: Tue, 10 Nov 2026 09:59:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-79165c59-485a-406c-aed5-666932e152f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-6a68523da281
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99ef2dd0-d6ce-4c06-a962-cdeb69e9f89e","handle":"qa-6a68523da281","displayName":"QA 6a68523da281","region":"eu","role":"user","createdAt":"2026-11-10T09:59:45.894687548Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5109aef0-44d3-4c57-a4de-8e398a86e7da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5109aef0-44d3-4c57-a4de-8e398a86e7da
Content-Type: application/json

--- request body ---
{"handle":"qa-6a68523da281","password":"****"}

--- response: 200 in 74 ms ---
Date: Tue, 10 Nov 2026 09:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5109aef0-44d3-4c57-a4de-8e398a86e7da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99ef2dd0-d6ce-4c06-a962-cdeb69e9f89e"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-16f78d40-5c55-4a0b-9416-6613612781d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f78d40-5c55-4a0b-9416-6613612781d9
Content-Type: application/json

--- response: 404 in 87 ms ---
Date: Tue, 10 Nov 2026 09:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16f78d40-5c55-4a0b-9416-6613612781d9
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-16f78d40-5c55-4a0b-9416-6613612781d9"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-bde075c4-238b-4b38-8575-d19a96bd79f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bde075c4-238b-4b38-8575-d19a96bd79f0
Content-Type: application/json

--- response: 404 in 57 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bde075c4-238b-4b38-8575-d19a96bd79f0
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-bde075c4-238b-4b38-8575-d19a96bd79f0"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-198da2f7-1837-48d8-abef-8b833d9faa78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-198da2f7-1837-48d8-abef-8b833d9faa78
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-198da2f7-1837-48d8-abef-8b833d9faa78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-990cc494-f142-4b79-81fb-41be9e51c1d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-990cc494-f142-4b79-81fb-41be9e51c1d2
Content-Type: application/json

--- request body ---
{"handle":"qa-6a68523da281","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-990cc494-f142-4b79-81fb-41be9e51c1d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-990cc494-f142-4b79-81fb-41be9e51c1d2"}
```
