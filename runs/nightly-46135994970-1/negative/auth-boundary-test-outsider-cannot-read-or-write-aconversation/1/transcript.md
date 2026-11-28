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
| 1 | `POST /v1/accounts` | 201 | 420 | `qa-f6b4178a-8298-45a3-b45d-75f04e4220b6` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-1c70578b-1eba-4d7e-a962-63c377ba49fc` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-a531d378-9343-417b-ab00-e210c6b9fbeb` |
| 4 | `POST /v1/auth/token` | 200 | 44 | `qa-2aa855e6-7ec7-461e-927c-560c3bc414fc` |
| 5 | `POST /v1/conversations` | 201 | 26 | `qa-0aa64c9a-3c43-496b-8123-421be97b864f` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-16daba40-b965-4cd4-aabb-52a8f2bb0b1d` |
| 7 | `GET /v1/conversations/{id}` | 403 | 28 | `qa-e47f5d4d-0fcf-4956-b7d8-bb326daa96ce` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 28 | `qa-6343cff9-c91f-43fa-96b2-74632ad5e3e3` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 22 | `qa-3efb4e81-cc53-41c4-9efb-77e240f86ded` |
| 10 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-47fed1d7-a25d-441a-b6c9-ba3f0bf2d30a` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-b231da74-b43d-4524-8ac8-6f44a96d61df` |
| 12 | `POST /v1/auth/token` | 200 | 18 | `qa-e40d6afa-a416-44a2-a6c3-5ed7fef54e2f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-90ef28ef-438e-454f-8d20-fbb0c73e23cd` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-9c28777e-81d5-4885-9504-e6c695c326df` |
| 15 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-99cb9c15-15eb-4364-adb5-f8c62193a274` |
| 16 | `POST /v1/auth/token` | 401 | 12 | `qa-d4e04b3c-9b22-4724-8843-0b4c6f9a307b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6b4178a-8298-45a3-b45d-75f04e4220b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6b4178a-8298-45a3-b45d-75f04e4220b6
Content-Type: application/json

--- request body ---
{"handle":"qa-0c1fc2e192c0","displayName":"QA 0c1fc2e192c0","password":"****","region":"eu"}

--- response: 201 in 420 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6b4178a-8298-45a3-b45d-75f04e4220b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-0c1fc2e192c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db5d9263-a641-4a80-adba-5e403b3f614a","handle":"qa-0c1fc2e192c0","displayName":"QA 0c1fc2e192c0","region":"eu","role":"user","createdAt":"2026-11-28T10:37:13.308395532Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1c70578b-1eba-4d7e-a962-63c377ba49fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c70578b-1eba-4d7e-a962-63c377ba49fc
Content-Type: application/json

--- request body ---
{"handle":"qa-0602a167e42c","displayName":"QA 0602a167e42c","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c70578b-1eba-4d7e-a962-63c377ba49fc
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
Location: /v1/accounts/qa-0602a167e42c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60c4dc46-d5b3-4383-a5f2-7bfefa8242ec","handle":"qa-0602a167e42c","displayName":"QA 0602a167e42c","region":"eu","role":"user","createdAt":"2026-11-28T10:37:13.713672785Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a531d378-9343-417b-ab00-e210c6b9fbeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a531d378-9343-417b-ab00-e210c6b9fbeb
Content-Type: application/json

--- request body ---
{"handle":"qa-37ffa29671ca","displayName":"QA 37ffa29671ca","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-a531d378-9343-417b-ab00-e210c6b9fbeb
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
Location: /v1/accounts/qa-37ffa29671ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7aef238-1324-4d8f-92fc-fe6a4ab7ab8f","handle":"qa-37ffa29671ca","displayName":"QA 37ffa29671ca","region":"eu","role":"user","createdAt":"2026-11-28T10:37:13.763573476Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-2aa855e6-7ec7-461e-927c-560c3bc414fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aa855e6-7ec7-461e-927c-560c3bc414fc
Content-Type: application/json

--- request body ---
{"handle":"qa-0c1fc2e192c0","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aa855e6-7ec7-461e-927c-560c3bc414fc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db5d9263-a641-4a80-adba-5e403b3f614a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0aa64c9a-3c43-496b-8123-421be97b864f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa64c9a-3c43-496b-8123-421be97b864f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0602a167e42c","subject":"Private","message":"Just us"}

--- response: 201 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-0aa64c9a-3c43-496b-8123-421be97b864f
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
Location: /v1/conversations/cnv_562344a6-4a66-4892-a48f-4d9e005af081
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_562344a6-4a66-4892-a48f-4d9e005af081","subject":"Private","status":"open","region":"eu","participants":["qa-0c1fc2e192c0","qa-0602a167e42c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:13.902368133Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-16daba40-b965-4cd4-aabb-52a8f2bb0b1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16daba40-b965-4cd4-aabb-52a8f2bb0b1d
Content-Type: application/json

--- request body ---
{"handle":"qa-37ffa29671ca","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-16daba40-b965-4cd4-aabb-52a8f2bb0b1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7aef238-1324-4d8f-92fc-fe6a4ab7ab8f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_562344a6-4a66-4892-a48f-4d9e005af081
correlation: qa-e47f5d4d-0fcf-4956-b7d8-bb326daa96ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e47f5d4d-0fcf-4956-b7d8-bb326daa96ce
Content-Type: application/json

--- response: 403 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e47f5d4d-0fcf-4956-b7d8-bb326daa96ce
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_562344a6-4a66-4892-a48f-4d9e005af081","correlationId":"qa-e47f5d4d-0fcf-4956-b7d8-bb326daa96ce"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_562344a6-4a66-4892-a48f-4d9e005af081/messages
correlation: qa-6343cff9-c91f-43fa-96b2-74632ad5e3e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6343cff9-c91f-43fa-96b2-74632ad5e3e3
Content-Type: application/json

--- response: 403 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6343cff9-c91f-43fa-96b2-74632ad5e3e3
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_562344a6-4a66-4892-a48f-4d9e005af081/messages","correlationId":"qa-6343cff9-c91f-43fa-96b2-74632ad5e3e3"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_562344a6-4a66-4892-a48f-4d9e005af081/messages
correlation: qa-3efb4e81-cc53-41c4-9efb-77e240f86ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3efb4e81-cc53-41c4-9efb-77e240f86ded
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3efb4e81-cc53-41c4-9efb-77e240f86ded
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_562344a6-4a66-4892-a48f-4d9e005af081/messages","correlationId":"qa-3efb4e81-cc53-41c4-9efb-77e240f86ded"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-47fed1d7-a25d-441a-b6c9-ba3f0bf2d30a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47fed1d7-a25d-441a-b6c9-ba3f0bf2d30a
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-47fed1d7-a25d-441a-b6c9-ba3f0bf2d30a
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
correlation: qa-b231da74-b43d-4524-8ac8-6f44a96d61df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b231da74-b43d-4524-8ac8-6f44a96d61df
Content-Type: application/json

--- request body ---
{"handle":"qa-37ffa29671ca","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b231da74-b43d-4524-8ac8-6f44a96d61df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b231da74-b43d-4524-8ac8-6f44a96d61df"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e40d6afa-a416-44a2-a6c3-5ed7fef54e2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e40d6afa-a416-44a2-a6c3-5ed7fef54e2f
Content-Type: application/json

--- request body ---
{"handle":"qa-0602a167e42c","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-e40d6afa-a416-44a2-a6c3-5ed7fef54e2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60c4dc46-d5b3-4383-a5f2-7bfefa8242ec"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-90ef28ef-438e-454f-8d20-fbb0c73e23cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90ef28ef-438e-454f-8d20-fbb0c73e23cd
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-90ef28ef-438e-454f-8d20-fbb0c73e23cd
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
correlation: qa-9c28777e-81d5-4885-9504-e6c695c326df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c28777e-81d5-4885-9504-e6c695c326df
Content-Type: application/json

--- request body ---
{"handle":"qa-0602a167e42c","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c28777e-81d5-4885-9504-e6c695c326df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c28777e-81d5-4885-9504-e6c695c326df"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99cb9c15-15eb-4364-adb5-f8c62193a274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99cb9c15-15eb-4364-adb5-f8c62193a274
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99cb9c15-15eb-4364-adb5-f8c62193a274
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-d4e04b3c-9b22-4724-8843-0b4c6f9a307b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4e04b3c-9b22-4724-8843-0b4c6f9a307b
Content-Type: application/json

--- request body ---
{"handle":"qa-0c1fc2e192c0","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4e04b3c-9b22-4724-8843-0b4c6f9a307b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4e04b3c-9b22-4724-8843-0b4c6f9a307b"}
```
