# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-48eaa78c-0223-4fc3-b5ce-41a60a1f1b4a` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-0aae47f2-497f-43cb-93d2-1f12b7fd8914` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-ed376b52-5a4e-4609-b679-c86afe3ba237` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-34c24417-8426-41d7-95ed-3e1a96bbac9c` |
| 5 | `DELETE /v1/accounts/me` | 503 | 16 | `qa-9b455404-be14-4dd4-b978-698897dbf6e8` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-d2df80b1-73a1-4529-9937-2de59a4a9404` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ddcf791c-9266-4179-873e-f58fce09774c` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-a95eaa54-5302-469b-b02d-8ac5bf748624` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8eaf7d21-a880-475d-baf0-cdadb6c119e8` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-c675b1a0-4eca-4bca-959e-13be30c0467a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-48eaa78c-0223-4fc3-b5ce-41a60a1f1b4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48eaa78c-0223-4fc3-b5ce-41a60a1f1b4a
Content-Type: application/json

--- request body ---
{"handle":"qa-d1cce9110e62","displayName":"QA d1cce9110e62","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-48eaa78c-0223-4fc3-b5ce-41a60a1f1b4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Location: /v1/accounts/qa-d1cce9110e62
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8cad4eab-f23d-4851-925f-970228a65517","handle":"qa-d1cce9110e62","displayName":"QA d1cce9110e62","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.885815767Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0aae47f2-497f-43cb-93d2-1f12b7fd8914

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aae47f2-497f-43cb-93d2-1f12b7fd8914
Content-Type: application/json

--- request body ---
{"handle":"qa-6adf0229a49a","displayName":"QA 6adf0229a49a","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0aae47f2-497f-43cb-93d2-1f12b7fd8914
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 9
Location: /v1/accounts/qa-6adf0229a49a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13271341-ea15-47c1-be38-1446f33395b1","handle":"qa-6adf0229a49a","displayName":"QA 6adf0229a49a","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.928863086Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ed376b52-5a4e-4609-b679-c86afe3ba237

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed376b52-5a4e-4609-b679-c86afe3ba237
Content-Type: application/json

--- request body ---
{"handle":"qa-d1cce9110e62","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed376b52-5a4e-4609-b679-c86afe3ba237
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8cad4eab-f23d-4851-925f-970228a65517"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-34c24417-8426-41d7-95ed-3e1a96bbac9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34c24417-8426-41d7-95ed-3e1a96bbac9c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6adf0229a49a","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-34c24417-8426-41d7-95ed-3e1a96bbac9c
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
Location: /v1/conversations/cnv_6a807b27-a547-44de-b28d-8dec37984632
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6a807b27-a547-44de-b28d-8dec37984632","subject":"Error contract","status":"open","region":"eu","participants":["qa-d1cce9110e62","qa-6adf0229a49a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.026349095Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b455404-be14-4dd4-b978-698897dbf6e8

--- request headers ---
Accept: application/json
X-Fault-Key: 425f027d-e883-4314-ba91-624a67137920
X-Fault: unavailable-once
X-Correlation-Id: qa-9b455404-be14-4dd4-b978-698897dbf6e8
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b455404-be14-4dd4-b978-698897dbf6e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-9b455404-be14-4dd4-b978-698897dbf6e8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d2df80b1-73a1-4529-9937-2de59a4a9404

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2df80b1-73a1-4529-9937-2de59a4a9404
Content-Type: application/json

--- request body ---
{"handle":"qa-6adf0229a49a","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2df80b1-73a1-4529-9937-2de59a4a9404
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13271341-ea15-47c1-be38-1446f33395b1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ddcf791c-9266-4179-873e-f58fce09774c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddcf791c-9266-4179-873e-f58fce09774c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ddcf791c-9266-4179-873e-f58fce09774c
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a95eaa54-5302-469b-b02d-8ac5bf748624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a95eaa54-5302-469b-b02d-8ac5bf748624
Content-Type: application/json

--- request body ---
{"handle":"qa-6adf0229a49a","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a95eaa54-5302-469b-b02d-8ac5bf748624
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a95eaa54-5302-469b-b02d-8ac5bf748624"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8eaf7d21-a880-475d-baf0-cdadb6c119e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eaf7d21-a880-475d-baf0-cdadb6c119e8
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8eaf7d21-a880-475d-baf0-cdadb6c119e8
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c675b1a0-4eca-4bca-959e-13be30c0467a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c675b1a0-4eca-4bca-959e-13be30c0467a
Content-Type: application/json

--- request body ---
{"handle":"qa-d1cce9110e62","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c675b1a0-4eca-4bca-959e-13be30c0467a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c675b1a0-4eca-4bca-959e-13be30c0467a"}
```
