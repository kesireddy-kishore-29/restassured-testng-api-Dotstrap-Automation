# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-c990cb7f-4a35-4789-92bc-287100860226` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-8b4ddfbd-a5bc-443d-87fc-e41bd2c13e1d` |
| 3 | `POST /v1/accounts` | 201 | 65 | `qa-20999115-07c7-4519-b193-3fa26692fc1d` |
| 4 | `POST /v1/auth/token` | 200 | 37 | `qa-84566f1a-37d2-4a1d-8517-82e5c403b30a` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-8e4c9173-4321-4012-8d64-84c92f2525f5` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-126379a9-56ed-40bf-8c89-4f12c4cd0115` |
| 7 | `GET /v1/conversations/{id}` | 403 | 11 | `qa-abf59b85-f1a3-4f8d-bc62-7c3cedf976be` |
| 8 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-a5c9613f-4111-4d0f-9f88-e42cdda0e4a6` |
| 9 | `POST /v1/auth/token` | 401 | 40 | `qa-172b1c43-b7a6-4f01-864b-bb8d46f292fb` |
| 10 | `POST /v1/auth/token` | 200 | 52 | `qa-04e99ac1-c4d8-47d1-97dd-9377fa3e5e4f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-21b0bf70-3268-44a8-bd83-2d411d3fff3a` |
| 12 | `POST /v1/auth/token` | 401 | 95 | `qa-384b49b8-1822-4fb7-a260-f76fac684663` |
| 13 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-ff6fc396-316e-4b3e-9657-0da74a07dae6` |
| 14 | `POST /v1/auth/token` | 401 | 33 | `qa-81c9a5bd-010a-480a-a1e1-b0c9cc7ac021` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c990cb7f-4a35-4789-92bc-287100860226

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c990cb7f-4a35-4789-92bc-287100860226
Content-Type: application/json

--- request body ---
{"handle":"qa-e64db21ad31f","displayName":"QA e64db21ad31f","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c990cb7f-4a35-4789-92bc-287100860226
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-e64db21ad31f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05f205c7-4ff1-45ce-afa4-35047259cf4e","handle":"qa-e64db21ad31f","displayName":"QA e64db21ad31f","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.381576563Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8b4ddfbd-a5bc-443d-87fc-e41bd2c13e1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4ddfbd-a5bc-443d-87fc-e41bd2c13e1d
Content-Type: application/json

--- request body ---
{"handle":"qa-54dd929bc1ec","displayName":"QA 54dd929bc1ec","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b4ddfbd-a5bc-443d-87fc-e41bd2c13e1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-54dd929bc1ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b0c4aba9-fad6-4909-a201-57355c4d3a0f","handle":"qa-54dd929bc1ec","displayName":"QA 54dd929bc1ec","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.422678602Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-20999115-07c7-4519-b193-3fa26692fc1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20999115-07c7-4519-b193-3fa26692fc1d
Content-Type: application/json

--- request body ---
{"handle":"qa-9dfb5a36b7d0","displayName":"QA 9dfb5a36b7d0","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-20999115-07c7-4519-b193-3fa26692fc1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-9dfb5a36b7d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27bd2244-1b0f-41ef-9e59-9e6580fad612","handle":"qa-9dfb5a36b7d0","displayName":"QA 9dfb5a36b7d0","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.534104789Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-84566f1a-37d2-4a1d-8517-82e5c403b30a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84566f1a-37d2-4a1d-8517-82e5c403b30a
Content-Type: application/json

--- request body ---
{"handle":"qa-e64db21ad31f","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-84566f1a-37d2-4a1d-8517-82e5c403b30a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05f205c7-4ff1-45ce-afa4-35047259cf4e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8e4c9173-4321-4012-8d64-84c92f2525f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e4c9173-4321-4012-8d64-84c92f2525f5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-54dd929bc1ec","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e4c9173-4321-4012-8d64-84c92f2525f5
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
Location: /v1/conversations/cnv_a62cdee9-3e89-4f47-ac1a-d7cbc0d5fd23
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a62cdee9-3e89-4f47-ac1a-d7cbc0d5fd23","subject":"Error contract","status":"open","region":"eu","participants":["qa-e64db21ad31f","qa-54dd929bc1ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.628308807Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-126379a9-56ed-40bf-8c89-4f12c4cd0115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-126379a9-56ed-40bf-8c89-4f12c4cd0115
Content-Type: application/json

--- request body ---
{"handle":"qa-9dfb5a36b7d0","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-126379a9-56ed-40bf-8c89-4f12c4cd0115
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27bd2244-1b0f-41ef-9e59-9e6580fad612"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a62cdee9-3e89-4f47-ac1a-d7cbc0d5fd23
correlation: qa-abf59b85-f1a3-4f8d-bc62-7c3cedf976be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abf59b85-f1a3-4f8d-bc62-7c3cedf976be
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abf59b85-f1a3-4f8d-bc62-7c3cedf976be
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a62cdee9-3e89-4f47-ac1a-d7cbc0d5fd23","correlationId":"qa-abf59b85-f1a3-4f8d-bc62-7c3cedf976be"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5c9613f-4111-4d0f-9f88-e42cdda0e4a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5c9613f-4111-4d0f-9f88-e42cdda0e4a6
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5c9613f-4111-4d0f-9f88-e42cdda0e4a6
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-172b1c43-b7a6-4f01-864b-bb8d46f292fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-172b1c43-b7a6-4f01-864b-bb8d46f292fb
Content-Type: application/json

--- request body ---
{"handle":"qa-9dfb5a36b7d0","password":"****"}

--- response: 401 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-172b1c43-b7a6-4f01-864b-bb8d46f292fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-172b1c43-b7a6-4f01-864b-bb8d46f292fb"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-04e99ac1-c4d8-47d1-97dd-9377fa3e5e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04e99ac1-c4d8-47d1-97dd-9377fa3e5e4f
Content-Type: application/json

--- request body ---
{"handle":"qa-54dd929bc1ec","password":"****"}

--- response: 200 in 52 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-04e99ac1-c4d8-47d1-97dd-9377fa3e5e4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0c4aba9-fad6-4909-a201-57355c4d3a0f"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21b0bf70-3268-44a8-bd83-2d411d3fff3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21b0bf70-3268-44a8-bd83-2d411d3fff3a
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21b0bf70-3268-44a8-bd83-2d411d3fff3a
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-384b49b8-1822-4fb7-a260-f76fac684663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-384b49b8-1822-4fb7-a260-f76fac684663
Content-Type: application/json

--- request body ---
{"handle":"qa-54dd929bc1ec","password":"****"}

--- response: 401 in 95 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-384b49b8-1822-4fb7-a260-f76fac684663
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-384b49b8-1822-4fb7-a260-f76fac684663"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff6fc396-316e-4b3e-9657-0da74a07dae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff6fc396-316e-4b3e-9657-0da74a07dae6
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff6fc396-316e-4b3e-9657-0da74a07dae6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-81c9a5bd-010a-480a-a1e1-b0c9cc7ac021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81c9a5bd-010a-480a-a1e1-b0c9cc7ac021
Content-Type: application/json

--- request body ---
{"handle":"qa-e64db21ad31f","password":"****"}

--- response: 401 in 33 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81c9a5bd-010a-480a-a1e1-b0c9cc7ac021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81c9a5bd-010a-480a-a1e1-b0c9cc7ac021"}
```
