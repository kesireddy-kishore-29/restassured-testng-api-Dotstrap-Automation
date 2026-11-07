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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-f035e777-ba85-4296-9aee-b6ecc1b81504` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-6b050122-9785-4de4-a69a-cf4d4021bc58` |
| 3 | `POST /v1/accounts` | 201 | 17 | `qa-2856d2f2-305d-444c-a731-2088b9c2fb0f` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-8c857d7b-e2c1-4988-abc2-ee86981b32ac` |
| 5 | `POST /v1/conversations` | 201 | 31 | `qa-67792f53-a70b-44ea-8354-1bdf12e66636` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-53733c12-1382-430d-ae96-b27a241ef6c8` |
| 7 | `GET /v1/conversations/{id}` | 403 | 5 | `qa-195b6e61-5efc-491c-b829-c36e082bf9a3` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-cc2660db-cf27-4f89-ac80-7f43caf7764a` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-f7e017fb-ea42-4f43-992b-5a8df5314cb5` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-efa1c565-d2fc-4553-b02c-1e69b699a957` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-0d1bd4d9-87ab-4db0-9e5f-750a49671a0d` |
| 12 | `POST /v1/auth/token` | 200 | 13 | `qa-44d8cd96-5f79-4055-a3fc-dedd3298e01e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-aa0915fc-dc98-4e3a-90fb-d5f9a3c41c83` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-fe74475c-e367-478b-b7ee-638d4995d068` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-1250ca07-e584-4e9a-b4ad-e9f1529c450f` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-6ffffcca-b967-4077-97b9-3d96e16f961a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f035e777-ba85-4296-9aee-b6ecc1b81504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f035e777-ba85-4296-9aee-b6ecc1b81504
Content-Type: application/json

--- request body ---
{"handle":"qa-04ccd0dd3948","displayName":"QA 04ccd0dd3948","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-f035e777-ba85-4296-9aee-b6ecc1b81504
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-04ccd0dd3948
X-Served-Region: eu
Content-Length: 181

{"id":"acc_714d2b25-8af9-4079-90e3-38b38c8ebc2c","handle":"qa-04ccd0dd3948","displayName":"QA 04ccd0dd3948","region":"eu","role":"user","createdAt":"2026-11-06T09:30:29.523342666Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6b050122-9785-4de4-a69a-cf4d4021bc58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b050122-9785-4de4-a69a-cf4d4021bc58
Content-Type: application/json

--- request body ---
{"handle":"qa-3926c196a9f9","displayName":"QA 3926c196a9f9","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b050122-9785-4de4-a69a-cf4d4021bc58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-3926c196a9f9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2a4fbd5-1eae-4f0c-8c8c-517bd4cdcd48","handle":"qa-3926c196a9f9","displayName":"QA 3926c196a9f9","region":"eu","role":"user","createdAt":"2026-11-06T09:30:29.563502751Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2856d2f2-305d-444c-a731-2088b9c2fb0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2856d2f2-305d-444c-a731-2088b9c2fb0f
Content-Type: application/json

--- request body ---
{"handle":"qa-3ccd5ba7dc57","displayName":"QA 3ccd5ba7dc57","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-2856d2f2-305d-444c-a731-2088b9c2fb0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-3ccd5ba7dc57
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b6b36aa-3995-40fc-96f5-d2d830b96363","handle":"qa-3ccd5ba7dc57","displayName":"QA 3ccd5ba7dc57","region":"eu","role":"user","createdAt":"2026-11-06T09:30:29.600077919Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8c857d7b-e2c1-4988-abc2-ee86981b32ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c857d7b-e2c1-4988-abc2-ee86981b32ac
Content-Type: application/json

--- request body ---
{"handle":"qa-04ccd0dd3948","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c857d7b-e2c1-4988-abc2-ee86981b32ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_714d2b25-8af9-4079-90e3-38b38c8ebc2c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-67792f53-a70b-44ea-8354-1bdf12e66636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67792f53-a70b-44ea-8354-1bdf12e66636
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3926c196a9f9","subject":"Private","message":"Just us"}

--- response: 201 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-67792f53-a70b-44ea-8354-1bdf12e66636
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
Location: /v1/conversations/cnv_0928b824-ba72-4a98-bceb-370919b5037a
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_0928b824-ba72-4a98-bceb-370919b5037a","subject":"Private","status":"open","region":"eu","participants":["qa-04ccd0dd3948","qa-3926c196a9f9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:29.668279229Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-53733c12-1382-430d-ae96-b27a241ef6c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53733c12-1382-430d-ae96-b27a241ef6c8
Content-Type: application/json

--- request body ---
{"handle":"qa-3ccd5ba7dc57","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-53733c12-1382-430d-ae96-b27a241ef6c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b6b36aa-3995-40fc-96f5-d2d830b96363"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0928b824-ba72-4a98-bceb-370919b5037a
correlation: qa-195b6e61-5efc-491c-b829-c36e082bf9a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-195b6e61-5efc-491c-b829-c36e082bf9a3
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-195b6e61-5efc-491c-b829-c36e082bf9a3
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0928b824-ba72-4a98-bceb-370919b5037a","correlationId":"qa-195b6e61-5efc-491c-b829-c36e082bf9a3"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_0928b824-ba72-4a98-bceb-370919b5037a/messages
correlation: qa-cc2660db-cf27-4f89-ac80-7f43caf7764a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc2660db-cf27-4f89-ac80-7f43caf7764a
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc2660db-cf27-4f89-ac80-7f43caf7764a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0928b824-ba72-4a98-bceb-370919b5037a/messages","correlationId":"qa-cc2660db-cf27-4f89-ac80-7f43caf7764a"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_0928b824-ba72-4a98-bceb-370919b5037a/messages
correlation: qa-f7e017fb-ea42-4f43-992b-5a8df5314cb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7e017fb-ea42-4f43-992b-5a8df5314cb5
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7e017fb-ea42-4f43-992b-5a8df5314cb5
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0928b824-ba72-4a98-bceb-370919b5037a/messages","correlationId":"qa-f7e017fb-ea42-4f43-992b-5a8df5314cb5"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-efa1c565-d2fc-4553-b02c-1e69b699a957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efa1c565-d2fc-4553-b02c-1e69b699a957
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-efa1c565-d2fc-4553-b02c-1e69b699a957
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
correlation: qa-0d1bd4d9-87ab-4db0-9e5f-750a49671a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d1bd4d9-87ab-4db0-9e5f-750a49671a0d
Content-Type: application/json

--- request body ---
{"handle":"qa-3ccd5ba7dc57","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d1bd4d9-87ab-4db0-9e5f-750a49671a0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d1bd4d9-87ab-4db0-9e5f-750a49671a0d"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-44d8cd96-5f79-4055-a3fc-dedd3298e01e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44d8cd96-5f79-4055-a3fc-dedd3298e01e
Content-Type: application/json

--- request body ---
{"handle":"qa-3926c196a9f9","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-44d8cd96-5f79-4055-a3fc-dedd3298e01e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2a4fbd5-1eae-4f0c-8c8c-517bd4cdcd48"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa0915fc-dc98-4e3a-90fb-d5f9a3c41c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa0915fc-dc98-4e3a-90fb-d5f9a3c41c83
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa0915fc-dc98-4e3a-90fb-d5f9a3c41c83
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
correlation: qa-fe74475c-e367-478b-b7ee-638d4995d068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe74475c-e367-478b-b7ee-638d4995d068
Content-Type: application/json

--- request body ---
{"handle":"qa-3926c196a9f9","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe74475c-e367-478b-b7ee-638d4995d068
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe74475c-e367-478b-b7ee-638d4995d068"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1250ca07-e584-4e9a-b4ad-e9f1529c450f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1250ca07-e584-4e9a-b4ad-e9f1529c450f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1250ca07-e584-4e9a-b4ad-e9f1529c450f
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
correlation: qa-6ffffcca-b967-4077-97b9-3d96e16f961a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ffffcca-b967-4077-97b9-3d96e16f961a
Content-Type: application/json

--- request body ---
{"handle":"qa-04ccd0dd3948","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ffffcca-b967-4077-97b9-3d96e16f961a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ffffcca-b967-4077-97b9-3d96e16f961a"}
```
