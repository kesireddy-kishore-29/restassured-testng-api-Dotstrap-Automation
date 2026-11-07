# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 294 | `qa-a320ab30-07e2-40d5-9699-3c50c3b3377c` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-a6354ab8-cb4e-4f9f-adc2-f8c2ef6f4d4b` |
| 3 | `POST /v1/accounts` | 201 | 19 | `qa-f847e90c-eb85-4952-aee1-2dbc97bd6d8e` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-363da482-0cd9-4cf2-a95b-9baa4ae3765e` |
| 5 | `POST /v1/conversations` | 201 | 29 | `qa-ccb8d666-9026-43b1-bf6c-192a8ac2e0eb` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-6b30e4a5-789f-4dba-baa5-90d0fc19f7fc` |
| 7 | `GET /v1/conversations/{id}` | 403 | 19 | `qa-22fdda7c-df68-4e00-adea-ababd01afe0c` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 14 | `qa-57ac1fd3-b196-4bbe-9ac3-f610ca977a3c` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 14 | `qa-d55f05a3-19d1-4146-9f04-85086ea6e5a0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a461ad27-bab2-4d7a-af67-e63e6638057f` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-e37c569e-8163-4909-b8b9-e11436afe6c9` |
| 12 | `POST /v1/auth/token` | 200 | 16 | `qa-02b156a9-a127-4235-a430-a704db4124ea` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5ff57f3a-1fa9-4543-b586-cb27b3503ac2` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-e5ea57bf-ea14-48ca-8eb0-863171b490c5` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b86724b0-4da3-43d8-b2b0-400bb48fd710` |
| 16 | `POST /v1/auth/token` | 401 | 14 | `qa-5dc43d0e-5c20-41b1-9e4f-e9a2b64f6536` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a320ab30-07e2-40d5-9699-3c50c3b3377c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a320ab30-07e2-40d5-9699-3c50c3b3377c
Content-Type: application/json

--- request body ---
{"handle":"qa-54b608bd1cee","displayName":"QA 54b608bd1cee","password":"****","region":"eu"}

--- response: 201 in 294 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a320ab30-07e2-40d5-9699-3c50c3b3377c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-54b608bd1cee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eeda74e8-93df-4776-8c62-7152072fde69","handle":"qa-54b608bd1cee","displayName":"QA 54b608bd1cee","region":"eu","role":"user","createdAt":"2026-11-01T09:23:21.371910136Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a6354ab8-cb4e-4f9f-adc2-f8c2ef6f4d4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6354ab8-cb4e-4f9f-adc2-f8c2ef6f4d4b
Content-Type: application/json

--- request body ---
{"handle":"qa-85a034d5cbcc","displayName":"QA 85a034d5cbcc","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6354ab8-cb4e-4f9f-adc2-f8c2ef6f4d4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-85a034d5cbcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a219cf07-46ed-4d8d-9b37-38aac2a469d0","handle":"qa-85a034d5cbcc","displayName":"QA 85a034d5cbcc","region":"eu","role":"user","createdAt":"2026-11-01T09:23:21.688844611Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f847e90c-eb85-4952-aee1-2dbc97bd6d8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f847e90c-eb85-4952-aee1-2dbc97bd6d8e
Content-Type: application/json

--- request body ---
{"handle":"qa-dea34b659dc0","displayName":"QA dea34b659dc0","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-f847e90c-eb85-4952-aee1-2dbc97bd6d8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-dea34b659dc0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68d6023a-b3ce-47fd-abf8-0df76f0c786f","handle":"qa-dea34b659dc0","displayName":"QA dea34b659dc0","region":"eu","role":"user","createdAt":"2026-11-01T09:23:21.726646691Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-363da482-0cd9-4cf2-a95b-9baa4ae3765e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-363da482-0cd9-4cf2-a95b-9baa4ae3765e
Content-Type: application/json

--- request body ---
{"handle":"qa-54b608bd1cee","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-363da482-0cd9-4cf2-a95b-9baa4ae3765e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eeda74e8-93df-4776-8c62-7152072fde69"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ccb8d666-9026-43b1-bf6c-192a8ac2e0eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb8d666-9026-43b1-bf6c-192a8ac2e0eb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-85a034d5cbcc","subject":"Private","message":"Just us"}

--- response: 201 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccb8d666-9026-43b1-bf6c-192a8ac2e0eb
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
Location: /v1/conversations/cnv_a42e60e8-a66d-4987-98f4-e8e8227b6271
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_a42e60e8-a66d-4987-98f4-e8e8227b6271","subject":"Private","status":"open","region":"eu","participants":["qa-54b608bd1cee","qa-85a034d5cbcc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:21.809371874Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6b30e4a5-789f-4dba-baa5-90d0fc19f7fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b30e4a5-789f-4dba-baa5-90d0fc19f7fc
Content-Type: application/json

--- request body ---
{"handle":"qa-dea34b659dc0","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b30e4a5-789f-4dba-baa5-90d0fc19f7fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68d6023a-b3ce-47fd-abf8-0df76f0c786f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a42e60e8-a66d-4987-98f4-e8e8227b6271
correlation: qa-22fdda7c-df68-4e00-adea-ababd01afe0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22fdda7c-df68-4e00-adea-ababd01afe0c
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22fdda7c-df68-4e00-adea-ababd01afe0c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a42e60e8-a66d-4987-98f4-e8e8227b6271","correlationId":"qa-22fdda7c-df68-4e00-adea-ababd01afe0c"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_a42e60e8-a66d-4987-98f4-e8e8227b6271/messages
correlation: qa-57ac1fd3-b196-4bbe-9ac3-f610ca977a3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57ac1fd3-b196-4bbe-9ac3-f610ca977a3c
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57ac1fd3-b196-4bbe-9ac3-f610ca977a3c
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a42e60e8-a66d-4987-98f4-e8e8227b6271/messages","correlationId":"qa-57ac1fd3-b196-4bbe-9ac3-f610ca977a3c"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_a42e60e8-a66d-4987-98f4-e8e8227b6271/messages
correlation: qa-d55f05a3-19d1-4146-9f04-85086ea6e5a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d55f05a3-19d1-4146-9f04-85086ea6e5a0
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d55f05a3-19d1-4146-9f04-85086ea6e5a0
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a42e60e8-a66d-4987-98f4-e8e8227b6271/messages","correlationId":"qa-d55f05a3-19d1-4146-9f04-85086ea6e5a0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a461ad27-bab2-4d7a-af67-e63e6638057f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a461ad27-bab2-4d7a-af67-e63e6638057f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a461ad27-bab2-4d7a-af67-e63e6638057f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-e37c569e-8163-4909-b8b9-e11436afe6c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e37c569e-8163-4909-b8b9-e11436afe6c9
Content-Type: application/json

--- request body ---
{"handle":"qa-dea34b659dc0","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e37c569e-8163-4909-b8b9-e11436afe6c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e37c569e-8163-4909-b8b9-e11436afe6c9"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-02b156a9-a127-4235-a430-a704db4124ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02b156a9-a127-4235-a430-a704db4124ea
Content-Type: application/json

--- request body ---
{"handle":"qa-85a034d5cbcc","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-02b156a9-a127-4235-a430-a704db4124ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a219cf07-46ed-4d8d-9b37-38aac2a469d0"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ff57f3a-1fa9-4543-b586-cb27b3503ac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ff57f3a-1fa9-4543-b586-cb27b3503ac2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ff57f3a-1fa9-4543-b586-cb27b3503ac2
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-e5ea57bf-ea14-48ca-8eb0-863171b490c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5ea57bf-ea14-48ca-8eb0-863171b490c5
Content-Type: application/json

--- request body ---
{"handle":"qa-85a034d5cbcc","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5ea57bf-ea14-48ca-8eb0-863171b490c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5ea57bf-ea14-48ca-8eb0-863171b490c5"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b86724b0-4da3-43d8-b2b0-400bb48fd710

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b86724b0-4da3-43d8-b2b0-400bb48fd710
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b86724b0-4da3-43d8-b2b0-400bb48fd710
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-5dc43d0e-5c20-41b1-9e4f-e9a2b64f6536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc43d0e-5c20-41b1-9e4f-e9a2b64f6536
Content-Type: application/json

--- request body ---
{"handle":"qa-54b608bd1cee","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5dc43d0e-5c20-41b1-9e4f-e9a2b64f6536
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5dc43d0e-5c20-41b1-9e4f-e9a2b64f6536"}
```
