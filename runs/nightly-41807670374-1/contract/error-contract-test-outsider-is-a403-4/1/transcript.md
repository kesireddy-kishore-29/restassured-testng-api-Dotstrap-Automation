# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-2fe86c05-2e69-4971-a45c-cf0c54e904d8` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-be9d2343-d120-4d33-b0bc-b828f28a1a42` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-065fcf53-4e1b-4bd4-a1f1-dd05c575075b` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-4e7f4620-c758-4c10-89df-c3dddb04f169` |
| 5 | `POST /v1/conversations` | 201 | 22 | `qa-c7527832-bf09-4be9-8906-d11c0c26d799` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-8db5f61b-0eea-44cd-9ae3-af923c7a4491` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 23 | `qa-43c10751-29e3-44b4-820b-7c96886759d9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-19aecb02-3205-4b5b-9b6c-4c4ac18a03d1` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-352018f1-0c54-4bf1-aa02-a1e79c7d1199` |
| 10 | `POST /v1/auth/token` | 200 | 15 | `qa-e4f93f6f-95ea-4aad-bd68-d53ba2953104` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-8cf6b7e1-beaf-4a33-a006-bbec2ec25ae4` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-9b0ffa74-7087-4cdf-9879-995566c02e6f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-5f6c8c4e-6a2c-459c-955b-8d12ba994f09` |
| 14 | `POST /v1/auth/token` | 401 | 21 | `qa-608262a7-017a-44b8-b4d3-17a59f376f4e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2fe86c05-2e69-4971-a45c-cf0c54e904d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fe86c05-2e69-4971-a45c-cf0c54e904d8
Content-Type: application/json

--- request body ---
{"handle":"qa-6441ff4e9fe4","displayName":"QA 6441ff4e9fe4","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fe86c05-2e69-4971-a45c-cf0c54e904d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Location: /v1/accounts/qa-6441ff4e9fe4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bcb18194-5628-4e1b-a2be-f44f2d27a937","handle":"qa-6441ff4e9fe4","displayName":"QA 6441ff4e9fe4","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.405364675Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-be9d2343-d120-4d33-b0bc-b828f28a1a42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be9d2343-d120-4d33-b0bc-b828f28a1a42
Content-Type: application/json

--- request body ---
{"handle":"qa-633c06dc0c1f","displayName":"QA 633c06dc0c1f","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-be9d2343-d120-4d33-b0bc-b828f28a1a42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Location: /v1/accounts/qa-633c06dc0c1f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_793e771b-6406-498b-8eb6-72be4d5fadd6","handle":"qa-633c06dc0c1f","displayName":"QA 633c06dc0c1f","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.428475796Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-065fcf53-4e1b-4bd4-a1f1-dd05c575075b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-065fcf53-4e1b-4bd4-a1f1-dd05c575075b
Content-Type: application/json

--- request body ---
{"handle":"qa-74d6ca415284","displayName":"QA 74d6ca415284","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-065fcf53-4e1b-4bd4-a1f1-dd05c575075b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Location: /v1/accounts/qa-74d6ca415284
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ef44f096-c0c3-43d6-8926-3ebbd6e54369","handle":"qa-74d6ca415284","displayName":"QA 74d6ca415284","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.513030433Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4e7f4620-c758-4c10-89df-c3dddb04f169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e7f4620-c758-4c10-89df-c3dddb04f169
Content-Type: application/json

--- request body ---
{"handle":"qa-6441ff4e9fe4","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e7f4620-c758-4c10-89df-c3dddb04f169
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bcb18194-5628-4e1b-a2be-f44f2d27a937"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c7527832-bf09-4be9-8906-d11c0c26d799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7527832-bf09-4be9-8906-d11c0c26d799
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-633c06dc0c1f","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7527832-bf09-4be9-8906-d11c0c26d799
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
Location: /v1/conversations/cnv_eb249d89-3cb9-4065-ab1a-578dba8b50c8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eb249d89-3cb9-4065-ab1a-578dba8b50c8","subject":"Error contract","status":"open","region":"eu","participants":["qa-6441ff4e9fe4","qa-633c06dc0c1f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.589666785Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8db5f61b-0eea-44cd-9ae3-af923c7a4491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8db5f61b-0eea-44cd-9ae3-af923c7a4491
Content-Type: application/json

--- request body ---
{"handle":"qa-74d6ca415284","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8db5f61b-0eea-44cd-9ae3-af923c7a4491
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ef44f096-c0c3-43d6-8926-3ebbd6e54369"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_eb249d89-3cb9-4065-ab1a-578dba8b50c8/close
correlation: qa-43c10751-29e3-44b4-820b-7c96886759d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43c10751-29e3-44b4-820b-7c96886759d9
Content-Type: application/json

--- response: 403 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43c10751-29e3-44b4-820b-7c96886759d9
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_eb249d89-3cb9-4065-ab1a-578dba8b50c8/close","correlationId":"qa-43c10751-29e3-44b4-820b-7c96886759d9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19aecb02-3205-4b5b-9b6c-4c4ac18a03d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19aecb02-3205-4b5b-9b6c-4c4ac18a03d1
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19aecb02-3205-4b5b-9b6c-4c4ac18a03d1
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
correlation: qa-352018f1-0c54-4bf1-aa02-a1e79c7d1199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-352018f1-0c54-4bf1-aa02-a1e79c7d1199
Content-Type: application/json

--- request body ---
{"handle":"qa-74d6ca415284","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-352018f1-0c54-4bf1-aa02-a1e79c7d1199
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-352018f1-0c54-4bf1-aa02-a1e79c7d1199"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e4f93f6f-95ea-4aad-bd68-d53ba2953104

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4f93f6f-95ea-4aad-bd68-d53ba2953104
Content-Type: application/json

--- request body ---
{"handle":"qa-633c06dc0c1f","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4f93f6f-95ea-4aad-bd68-d53ba2953104
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_793e771b-6406-498b-8eb6-72be4d5fadd6"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cf6b7e1-beaf-4a33-a006-bbec2ec25ae4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cf6b7e1-beaf-4a33-a006-bbec2ec25ae4
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cf6b7e1-beaf-4a33-a006-bbec2ec25ae4
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
correlation: qa-9b0ffa74-7087-4cdf-9879-995566c02e6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b0ffa74-7087-4cdf-9879-995566c02e6f
Content-Type: application/json

--- request body ---
{"handle":"qa-633c06dc0c1f","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b0ffa74-7087-4cdf-9879-995566c02e6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b0ffa74-7087-4cdf-9879-995566c02e6f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f6c8c4e-6a2c-459c-955b-8d12ba994f09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f6c8c4e-6a2c-459c-955b-8d12ba994f09
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f6c8c4e-6a2c-459c-955b-8d12ba994f09
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-608262a7-017a-44b8-b4d3-17a59f376f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608262a7-017a-44b8-b4d3-17a59f376f4e
Content-Type: application/json

--- request body ---
{"handle":"qa-6441ff4e9fe4","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-608262a7-017a-44b8-b4d3-17a59f376f4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-608262a7-017a-44b8-b4d3-17a59f376f4e"}
```
