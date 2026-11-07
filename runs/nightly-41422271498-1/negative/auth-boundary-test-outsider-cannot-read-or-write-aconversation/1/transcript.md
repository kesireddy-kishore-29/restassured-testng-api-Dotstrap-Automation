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
| 1 | `POST /v1/accounts` | 201 | 501 | `qa-0786e92e-cb36-4047-bfce-7d4736615782` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-0a3b6866-dc3b-4da9-ac07-0f2160f64f42` |
| 3 | `POST /v1/accounts` | 201 | 34 | `qa-c7a1cbde-6ca9-44cd-8826-b801a4a23bec` |
| 4 | `POST /v1/auth/token` | 200 | 41 | `qa-f39a425e-f6b7-4c10-aaad-3c2ea4ef5c7d` |
| 5 | `POST /v1/conversations` | 201 | 81 | `qa-356cabe6-b12a-4df1-80ba-b92a0aad53bb` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-22193f6b-fa33-4e4b-8643-c0fde725bb69` |
| 7 | `GET /v1/conversations/{id}` | 403 | 59 | `qa-6d92611b-63d9-40a8-be2f-8563a01eec62` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 42 | `qa-be16cf03-e8f2-408a-8204-6c142b67ad88` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 12 | `qa-b98549f0-0106-4d4b-a704-99b4264ff9cd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c219245c-f4d6-47ea-93f8-ddf769586049` |
| 11 | `POST /v1/auth/token` | 401 | 35 | `qa-47864d98-1525-4ab2-a189-99acbf9b0487` |
| 12 | `POST /v1/auth/token` | 200 | 30 | `qa-a0cc6f67-8d30-4ce1-b81b-baebdc03a67e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-2bb9a8c3-8795-42a5-83cb-5eddff57a26d` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-ae6a7731-f9a7-48d7-8457-af13c5a09813` |
| 15 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b6c56511-b706-429f-9f01-330745941de1` |
| 16 | `POST /v1/auth/token` | 401 | 15 | `qa-559ba21f-3905-415c-b161-1f2ffd12e7d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0786e92e-cb36-4047-bfce-7d4736615782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0786e92e-cb36-4047-bfce-7d4736615782
Content-Type: application/json

--- request body ---
{"handle":"qa-89e67e377877","displayName":"QA 89e67e377877","password":"****","region":"eu"}

--- response: 201 in 501 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0786e92e-cb36-4047-bfce-7d4736615782
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
Location: /v1/accounts/qa-89e67e377877
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d738910-2204-478f-9cfb-07d767f44eb3","handle":"qa-89e67e377877","displayName":"QA 89e67e377877","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.218730796Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0a3b6866-dc3b-4da9-ac07-0f2160f64f42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a3b6866-dc3b-4da9-ac07-0f2160f64f42
Content-Type: application/json

--- request body ---
{"handle":"qa-a8ea8dc865fc","displayName":"QA a8ea8dc865fc","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a3b6866-dc3b-4da9-ac07-0f2160f64f42
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
Location: /v1/accounts/qa-a8ea8dc865fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c9f0747-1598-4d2f-84fe-6db4fac6d51f","handle":"qa-a8ea8dc865fc","displayName":"QA a8ea8dc865fc","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.732393787Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c7a1cbde-6ca9-44cd-8826-b801a4a23bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7a1cbde-6ca9-44cd-8826-b801a4a23bec
Content-Type: application/json

--- request body ---
{"handle":"qa-237fc18a2b3d","displayName":"QA 237fc18a2b3d","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7a1cbde-6ca9-44cd-8826-b801a4a23bec
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
Location: /v1/accounts/qa-237fc18a2b3d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c07011a-27aa-446d-bec6-6b5af19e2982","handle":"qa-237fc18a2b3d","displayName":"QA 237fc18a2b3d","region":"eu","role":"user","createdAt":"2026-11-02T09:38:41.813496247Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f39a425e-f6b7-4c10-aaad-3c2ea4ef5c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f39a425e-f6b7-4c10-aaad-3c2ea4ef5c7d
Content-Type: application/json

--- request body ---
{"handle":"qa-89e67e377877","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-f39a425e-f6b7-4c10-aaad-3c2ea4ef5c7d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d738910-2204-478f-9cfb-07d767f44eb3"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-356cabe6-b12a-4df1-80ba-b92a0aad53bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-356cabe6-b12a-4df1-80ba-b92a0aad53bb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a8ea8dc865fc","subject":"Private","message":"Just us"}

--- response: 201 in 81 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-356cabe6-b12a-4df1-80ba-b92a0aad53bb
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
Location: /v1/conversations/cnv_77c0eaf0-5989-451d-a0c7-cfdc0605b87f
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_77c0eaf0-5989-451d-a0c7-cfdc0605b87f","subject":"Private","status":"open","region":"eu","participants":["qa-89e67e377877","qa-a8ea8dc865fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:41.952647025Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-22193f6b-fa33-4e4b-8643-c0fde725bb69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22193f6b-fa33-4e4b-8643-c0fde725bb69
Content-Type: application/json

--- request body ---
{"handle":"qa-237fc18a2b3d","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-22193f6b-fa33-4e4b-8643-c0fde725bb69
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c07011a-27aa-446d-bec6-6b5af19e2982"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_77c0eaf0-5989-451d-a0c7-cfdc0605b87f
correlation: qa-6d92611b-63d9-40a8-be2f-8563a01eec62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d92611b-63d9-40a8-be2f-8563a01eec62
Content-Type: application/json

--- response: 403 in 59 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d92611b-63d9-40a8-be2f-8563a01eec62
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_77c0eaf0-5989-451d-a0c7-cfdc0605b87f","correlationId":"qa-6d92611b-63d9-40a8-be2f-8563a01eec62"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_77c0eaf0-5989-451d-a0c7-cfdc0605b87f/messages
correlation: qa-be16cf03-e8f2-408a-8204-6c142b67ad88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be16cf03-e8f2-408a-8204-6c142b67ad88
Content-Type: application/json

--- response: 403 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be16cf03-e8f2-408a-8204-6c142b67ad88
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_77c0eaf0-5989-451d-a0c7-cfdc0605b87f/messages","correlationId":"qa-be16cf03-e8f2-408a-8204-6c142b67ad88"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_77c0eaf0-5989-451d-a0c7-cfdc0605b87f/messages
correlation: qa-b98549f0-0106-4d4b-a704-99b4264ff9cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b98549f0-0106-4d4b-a704-99b4264ff9cd
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b98549f0-0106-4d4b-a704-99b4264ff9cd
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_77c0eaf0-5989-451d-a0c7-cfdc0605b87f/messages","correlationId":"qa-b98549f0-0106-4d4b-a704-99b4264ff9cd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c219245c-f4d6-47ea-93f8-ddf769586049

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c219245c-f4d6-47ea-93f8-ddf769586049
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c219245c-f4d6-47ea-93f8-ddf769586049
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
correlation: qa-47864d98-1525-4ab2-a189-99acbf9b0487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47864d98-1525-4ab2-a189-99acbf9b0487
Content-Type: application/json

--- request body ---
{"handle":"qa-237fc18a2b3d","password":"****"}

--- response: 401 in 35 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47864d98-1525-4ab2-a189-99acbf9b0487
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47864d98-1525-4ab2-a189-99acbf9b0487"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a0cc6f67-8d30-4ce1-b81b-baebdc03a67e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0cc6f67-8d30-4ce1-b81b-baebdc03a67e
Content-Type: application/json

--- request body ---
{"handle":"qa-a8ea8dc865fc","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0cc6f67-8d30-4ce1-b81b-baebdc03a67e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c9f0747-1598-4d2f-84fe-6db4fac6d51f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2bb9a8c3-8795-42a5-83cb-5eddff57a26d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb9a8c3-8795-42a5-83cb-5eddff57a26d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2bb9a8c3-8795-42a5-83cb-5eddff57a26d
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
correlation: qa-ae6a7731-f9a7-48d7-8457-af13c5a09813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae6a7731-f9a7-48d7-8457-af13c5a09813
Content-Type: application/json

--- request body ---
{"handle":"qa-a8ea8dc865fc","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae6a7731-f9a7-48d7-8457-af13c5a09813
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae6a7731-f9a7-48d7-8457-af13c5a09813"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6c56511-b706-429f-9f01-330745941de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6c56511-b706-429f-9f01-330745941de1
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6c56511-b706-429f-9f01-330745941de1
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
correlation: qa-559ba21f-3905-415c-b161-1f2ffd12e7d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-559ba21f-3905-415c-b161-1f2ffd12e7d6
Content-Type: application/json

--- request body ---
{"handle":"qa-89e67e377877","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-559ba21f-3905-415c-b161-1f2ffd12e7d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-559ba21f-3905-415c-b161-1f2ffd12e7d6"}
```
