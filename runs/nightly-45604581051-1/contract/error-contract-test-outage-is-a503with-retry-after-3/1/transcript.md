# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-9c5665f4-ffb5-4a36-8322-02772a310fa6` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-de960e1b-010b-4a5a-8f5b-6099bc20f21d` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-bd0ee4fe-230d-417c-b4e6-67b4ea8c47f4` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-6888423a-2bc0-4949-a58c-a1cf1e1b0335` |
| 5 | `PATCH /v1/accounts/me` | 503 | 12 | `qa-70f11f65-f8fc-400f-9087-29640b476499` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-a367fe34-054e-4271-9417-640580eee73a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-404cd7d6-c71e-4aac-b07e-efb6186f7cb5` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-fa9a1339-ca10-4d19-b5fa-05d5cb6cbcb8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-17a44931-1e5f-419b-8707-7750f126efb9` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-c1209bf6-acf8-4168-a211-0f1b12288bd6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c5665f4-ffb5-4a36-8322-02772a310fa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c5665f4-ffb5-4a36-8322-02772a310fa6
Content-Type: application/json

--- request body ---
{"handle":"qa-af3d18c3d9ae","displayName":"QA af3d18c3d9ae","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c5665f4-ffb5-4a36-8322-02772a310fa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-af3d18c3d9ae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c681c156-65bb-467a-b84e-917c47f261a2","handle":"qa-af3d18c3d9ae","displayName":"QA af3d18c3d9ae","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.215744055Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-de960e1b-010b-4a5a-8f5b-6099bc20f21d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de960e1b-010b-4a5a-8f5b-6099bc20f21d
Content-Type: application/json

--- request body ---
{"handle":"qa-5567b6c32501","displayName":"QA 5567b6c32501","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-de960e1b-010b-4a5a-8f5b-6099bc20f21d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-5567b6c32501
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79d74c01-9e42-41ac-8701-99427d6f02dc","handle":"qa-5567b6c32501","displayName":"QA 5567b6c32501","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.249735601Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bd0ee4fe-230d-417c-b4e6-67b4ea8c47f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0ee4fe-230d-417c-b4e6-67b4ea8c47f4
Content-Type: application/json

--- request body ---
{"handle":"qa-af3d18c3d9ae","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0ee4fe-230d-417c-b4e6-67b4ea8c47f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c681c156-65bb-467a-b84e-917c47f261a2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6888423a-2bc0-4949-a58c-a1cf1e1b0335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6888423a-2bc0-4949-a58c-a1cf1e1b0335
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5567b6c32501","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6888423a-2bc0-4949-a58c-a1cf1e1b0335
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
Location: /v1/conversations/cnv_0e7354a0-2468-475d-9db2-ed4ea99de4d2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0e7354a0-2468-475d-9db2-ed4ea99de4d2","subject":"Error contract","status":"open","region":"eu","participants":["qa-af3d18c3d9ae","qa-5567b6c32501"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.323815231Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-70f11f65-f8fc-400f-9087-29640b476499

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6ad4a15e-74f1-49ce-a2cb-1009d1c5b6a6
X-Correlation-Id: qa-70f11f65-f8fc-400f-9087-29640b476499
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70f11f65-f8fc-400f-9087-29640b476499
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-70f11f65-f8fc-400f-9087-29640b476499"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a367fe34-054e-4271-9417-640580eee73a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a367fe34-054e-4271-9417-640580eee73a
Content-Type: application/json

--- request body ---
{"handle":"qa-5567b6c32501","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a367fe34-054e-4271-9417-640580eee73a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79d74c01-9e42-41ac-8701-99427d6f02dc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-404cd7d6-c71e-4aac-b07e-efb6186f7cb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-404cd7d6-c71e-4aac-b07e-efb6186f7cb5
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-404cd7d6-c71e-4aac-b07e-efb6186f7cb5
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
correlation: qa-fa9a1339-ca10-4d19-b5fa-05d5cb6cbcb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa9a1339-ca10-4d19-b5fa-05d5cb6cbcb8
Content-Type: application/json

--- request body ---
{"handle":"qa-5567b6c32501","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa9a1339-ca10-4d19-b5fa-05d5cb6cbcb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa9a1339-ca10-4d19-b5fa-05d5cb6cbcb8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17a44931-1e5f-419b-8707-7750f126efb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a44931-1e5f-419b-8707-7750f126efb9
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17a44931-1e5f-419b-8707-7750f126efb9
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
correlation: qa-c1209bf6-acf8-4168-a211-0f1b12288bd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1209bf6-acf8-4168-a211-0f1b12288bd6
Content-Type: application/json

--- request body ---
{"handle":"qa-af3d18c3d9ae","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1209bf6-acf8-4168-a211-0f1b12288bd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1209bf6-acf8-4168-a211-0f1b12288bd6"}
```
