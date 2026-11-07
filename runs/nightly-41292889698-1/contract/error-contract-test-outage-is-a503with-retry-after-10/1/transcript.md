# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-9b28a13b-7ccc-4d0f-8695-61619c208645` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-6cd7d4d7-36eb-43fd-a644-1b166b9b8b7c` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-23783fb2-972a-452f-9264-045eccb14a1d` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-56234aaf-33dd-4649-870d-ee80313017fd` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 22 | `qa-be472ed2-5995-4886-a033-5ea0c9f9152e` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-3cc5a0ff-0bca-4fc7-a2d3-4ae9fb86ddb1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-809eb0eb-5477-4a70-afb9-7e8572d05e8c` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-38499140-f930-4a38-9c99-e7ef56af72a1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-aadda31f-58af-4f3d-92c3-f288c9deed47` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-342a19e5-8a59-4f4d-9961-12f8ff661a75` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b28a13b-7ccc-4d0f-8695-61619c208645

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b28a13b-7ccc-4d0f-8695-61619c208645
Content-Type: application/json

--- request body ---
{"handle":"qa-dde4c306cf10","displayName":"QA dde4c306cf10","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b28a13b-7ccc-4d0f-8695-61619c208645
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Location: /v1/accounts/qa-dde4c306cf10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0ab4456e-7aff-4f6a-82ee-ea6849232221","handle":"qa-dde4c306cf10","displayName":"QA dde4c306cf10","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.048532825Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6cd7d4d7-36eb-43fd-a644-1b166b9b8b7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd7d4d7-36eb-43fd-a644-1b166b9b8b7c
Content-Type: application/json

--- request body ---
{"handle":"qa-7ff73c57dfa7","displayName":"QA 7ff73c57dfa7","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cd7d4d7-36eb-43fd-a644-1b166b9b8b7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Location: /v1/accounts/qa-7ff73c57dfa7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04df65d4-9865-4e98-9f4a-f385f8d89a43","handle":"qa-7ff73c57dfa7","displayName":"QA 7ff73c57dfa7","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.099051602Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-23783fb2-972a-452f-9264-045eccb14a1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23783fb2-972a-452f-9264-045eccb14a1d
Content-Type: application/json

--- request body ---
{"handle":"qa-dde4c306cf10","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-23783fb2-972a-452f-9264-045eccb14a1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0ab4456e-7aff-4f6a-82ee-ea6849232221"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-56234aaf-33dd-4649-870d-ee80313017fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56234aaf-33dd-4649-870d-ee80313017fd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7ff73c57dfa7","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-56234aaf-33dd-4649-870d-ee80313017fd
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
Location: /v1/conversations/cnv_35ed80fb-818c-42c2-ba57-b70ce63bd1d2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_35ed80fb-818c-42c2-ba57-b70ce63bd1d2","subject":"Error contract","status":"open","region":"eu","participants":["qa-dde4c306cf10","qa-7ff73c57dfa7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.192244850Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_35ed80fb-818c-42c2-ba57-b70ce63bd1d2/messages
correlation: qa-be472ed2-5995-4886-a033-5ea0c9f9152e

--- request headers ---
Accept: application/json
X-Fault-Key: 6117627e-3dc9-4284-adbc-9c08466e96a4
X-Fault: unavailable-once
X-Correlation-Id: qa-be472ed2-5995-4886-a033-5ea0c9f9152e
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be472ed2-5995-4886-a033-5ea0c9f9152e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_35ed80fb-818c-42c2-ba57-b70ce63bd1d2/messages","correlationId":"qa-be472ed2-5995-4886-a033-5ea0c9f9152e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3cc5a0ff-0bca-4fc7-a2d3-4ae9fb86ddb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cc5a0ff-0bca-4fc7-a2d3-4ae9fb86ddb1
Content-Type: application/json

--- request body ---
{"handle":"qa-7ff73c57dfa7","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cc5a0ff-0bca-4fc7-a2d3-4ae9fb86ddb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04df65d4-9865-4e98-9f4a-f385f8d89a43"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-809eb0eb-5477-4a70-afb9-7e8572d05e8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-809eb0eb-5477-4a70-afb9-7e8572d05e8c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-809eb0eb-5477-4a70-afb9-7e8572d05e8c
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
correlation: qa-38499140-f930-4a38-9c99-e7ef56af72a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38499140-f930-4a38-9c99-e7ef56af72a1
Content-Type: application/json

--- request body ---
{"handle":"qa-7ff73c57dfa7","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38499140-f930-4a38-9c99-e7ef56af72a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38499140-f930-4a38-9c99-e7ef56af72a1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aadda31f-58af-4f3d-92c3-f288c9deed47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aadda31f-58af-4f3d-92c3-f288c9deed47
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aadda31f-58af-4f3d-92c3-f288c9deed47
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
correlation: qa-342a19e5-8a59-4f4d-9961-12f8ff661a75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-342a19e5-8a59-4f4d-9961-12f8ff661a75
Content-Type: application/json

--- request body ---
{"handle":"qa-dde4c306cf10","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-342a19e5-8a59-4f4d-9961-12f8ff661a75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-342a19e5-8a59-4f4d-9961-12f8ff661a75"}
```
