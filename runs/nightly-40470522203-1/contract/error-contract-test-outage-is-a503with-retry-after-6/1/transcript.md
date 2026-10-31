# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-05f576b3-de43-41cf-b255-61ff63e0273c` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-0dfa988b-1358-4f53-bd10-2d996052ed35` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-f4ef345c-bc30-47e5-a76e-77190d1f872f` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-3cb9d21b-b2ed-44a4-891a-5228eed37d4e` |
| 5 | `POST /v1/conversations` | 503 | 22 | `qa-16b7c512-2b29-47e9-9eb2-43e2a9324d8f` |
| 6 | `POST /v1/auth/token` | 200 | 79 | `qa-3a65f3d7-c33e-4c99-ae94-c305184e81ad` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-fbd395d3-3087-4ca7-b74a-60fb522eb89e` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-6b6323a5-a628-40cc-93ed-03e7c7d258ed` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d8a3cd95-0b92-4269-9458-d1504b32b1c8` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-c77a307f-1aa9-4b30-bd5d-055dcc1773af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-05f576b3-de43-41cf-b255-61ff63e0273c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05f576b3-de43-41cf-b255-61ff63e0273c
Content-Type: application/json

--- request body ---
{"handle":"qa-3283a4ac35af","displayName":"QA 3283a4ac35af","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-05f576b3-de43-41cf-b255-61ff63e0273c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-3283a4ac35af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31a1b426-5a99-4f2e-a3b3-ea2568484b9c","handle":"qa-3283a4ac35af","displayName":"QA 3283a4ac35af","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.186750198Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0dfa988b-1358-4f53-bd10-2d996052ed35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dfa988b-1358-4f53-bd10-2d996052ed35
Content-Type: application/json

--- request body ---
{"handle":"qa-3c97a07711e2","displayName":"QA 3c97a07711e2","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dfa988b-1358-4f53-bd10-2d996052ed35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 7
Location: /v1/accounts/qa-3c97a07711e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4da5feb2-6c43-4c5e-a991-273df3d6af90","handle":"qa-3c97a07711e2","displayName":"QA 3c97a07711e2","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.247110184Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f4ef345c-bc30-47e5-a76e-77190d1f872f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ef345c-bc30-47e5-a76e-77190d1f872f
Content-Type: application/json

--- request body ---
{"handle":"qa-3283a4ac35af","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4ef345c-bc30-47e5-a76e-77190d1f872f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31a1b426-5a99-4f2e-a3b3-ea2568484b9c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3cb9d21b-b2ed-44a4-891a-5228eed37d4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cb9d21b-b2ed-44a4-891a-5228eed37d4e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3c97a07711e2","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cb9d21b-b2ed-44a4-891a-5228eed37d4e
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
Location: /v1/conversations/cnv_eb6591d6-01e9-4ecf-adaf-56326a9b573a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eb6591d6-01e9-4ecf-adaf-56326a9b573a","subject":"Error contract","status":"open","region":"eu","participants":["qa-3283a4ac35af","qa-3c97a07711e2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.345209532Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-16b7c512-2b29-47e9-9eb2-43e2a9324d8f

--- request headers ---
Accept: application/json
X-Fault-Key: f377759a-ac39-4f11-a3e3-bd40c7efd325
X-Fault: unavailable-once
X-Correlation-Id: qa-16b7c512-2b29-47e9-9eb2-43e2a9324d8f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3283a4ac35af","subject":"Probe","message":"Hi"}

--- response: 503 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16b7c512-2b29-47e9-9eb2-43e2a9324d8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-16b7c512-2b29-47e9-9eb2-43e2a9324d8f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3a65f3d7-c33e-4c99-ae94-c305184e81ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a65f3d7-c33e-4c99-ae94-c305184e81ad
Content-Type: application/json

--- request body ---
{"handle":"qa-3c97a07711e2","password":"****"}

--- response: 200 in 79 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a65f3d7-c33e-4c99-ae94-c305184e81ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4da5feb2-6c43-4c5e-a991-273df3d6af90"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fbd395d3-3087-4ca7-b74a-60fb522eb89e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbd395d3-3087-4ca7-b74a-60fb522eb89e
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fbd395d3-3087-4ca7-b74a-60fb522eb89e
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
correlation: qa-6b6323a5-a628-40cc-93ed-03e7c7d258ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b6323a5-a628-40cc-93ed-03e7c7d258ed
Content-Type: application/json

--- request body ---
{"handle":"qa-3c97a07711e2","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b6323a5-a628-40cc-93ed-03e7c7d258ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b6323a5-a628-40cc-93ed-03e7c7d258ed"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8a3cd95-0b92-4269-9458-d1504b32b1c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8a3cd95-0b92-4269-9458-d1504b32b1c8
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8a3cd95-0b92-4269-9458-d1504b32b1c8
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
correlation: qa-c77a307f-1aa9-4b30-bd5d-055dcc1773af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c77a307f-1aa9-4b30-bd5d-055dcc1773af
Content-Type: application/json

--- request body ---
{"handle":"qa-3283a4ac35af","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c77a307f-1aa9-4b30-bd5d-055dcc1773af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c77a307f-1aa9-4b30-bd5d-055dcc1773af"}
```
