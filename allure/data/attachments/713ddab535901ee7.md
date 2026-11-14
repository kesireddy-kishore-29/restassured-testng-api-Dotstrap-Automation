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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-5abbd659-5c85-4a87-8911-645ec73b8d09` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-b2c168b3-d72d-45f9-84bd-c4df3e4b3470` |
| 3 | `POST /v1/accounts` | 201 | 38 | `qa-47f45ac5-5cbb-4684-8ee6-8510d83c2a17` |
| 4 | `POST /v1/auth/token` | 200 | 22 | `qa-1638ce95-1d95-4ba3-97d1-d1f161700e86` |
| 5 | `POST /v1/conversations` | 201 | 38 | `qa-f3c1edbd-f97c-4bbe-bc73-92cffc701983` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-1b315dcd-fb7a-4200-a751-51dd6399c0ce` |
| 7 | `GET /v1/conversations/{id}` | 403 | 15 | `qa-20873897-9047-4e7f-924a-eb3c860bff1b` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-49b95af6-74d5-4154-85ee-7499be419916` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 13 | `qa-57bbaac6-2579-4be8-a334-3e7a743ba852` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ff8da63b-65a9-44e4-9b15-c4a6966bb7b5` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-8a1f63f5-651b-4f8d-9464-ffd7bbd2b08a` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-b52ebc43-69d9-4db8-8aaf-1247e249f3d9` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ea6282da-85c5-4f24-be32-7fe72660cd27` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-32c616b0-98b9-4bd2-90e4-08ff00d9e866` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-45a1716b-8153-4c3d-be08-f336045f3b01` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-d1568a56-7598-448e-8221-6d7b2cb4b555` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5abbd659-5c85-4a87-8911-645ec73b8d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5abbd659-5c85-4a87-8911-645ec73b8d09
Content-Type: application/json

--- request body ---
{"handle":"qa-130b9c638a2c","displayName":"QA 130b9c638a2c","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-5abbd659-5c85-4a87-8911-645ec73b8d09
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
Location: /v1/accounts/qa-130b9c638a2c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a697aff-72dc-40d9-9e6b-a33ec6981abe","handle":"qa-130b9c638a2c","displayName":"QA 130b9c638a2c","region":"eu","role":"user","createdAt":"2026-11-14T09:05:21.842660822Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b2c168b3-d72d-45f9-84bd-c4df3e4b3470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2c168b3-d72d-45f9-84bd-c4df3e4b3470
Content-Type: application/json

--- request body ---
{"handle":"qa-9926f9774bb0","displayName":"QA 9926f9774bb0","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2c168b3-d72d-45f9-84bd-c4df3e4b3470
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
Location: /v1/accounts/qa-9926f9774bb0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3897fc1d-650f-48a3-be0a-d2cef47ce5ef","handle":"qa-9926f9774bb0","displayName":"QA 9926f9774bb0","region":"eu","role":"user","createdAt":"2026-11-14T09:05:21.891492800Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-47f45ac5-5cbb-4684-8ee6-8510d83c2a17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47f45ac5-5cbb-4684-8ee6-8510d83c2a17
Content-Type: application/json

--- request body ---
{"handle":"qa-015586bc49e2","displayName":"QA 015586bc49e2","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-47f45ac5-5cbb-4684-8ee6-8510d83c2a17
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
Location: /v1/accounts/qa-015586bc49e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78bf8e45-9004-479c-b839-268b595358bd","handle":"qa-015586bc49e2","displayName":"QA 015586bc49e2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:21.944097610Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1638ce95-1d95-4ba3-97d1-d1f161700e86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1638ce95-1d95-4ba3-97d1-d1f161700e86
Content-Type: application/json

--- request body ---
{"handle":"qa-130b9c638a2c","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-1638ce95-1d95-4ba3-97d1-d1f161700e86
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a697aff-72dc-40d9-9e6b-a33ec6981abe"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f3c1edbd-f97c-4bbe-bc73-92cffc701983

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3c1edbd-f97c-4bbe-bc73-92cffc701983
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9926f9774bb0","subject":"Private","message":"Just us"}

--- response: 201 in 38 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3c1edbd-f97c-4bbe-bc73-92cffc701983
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
Location: /v1/conversations/cnv_4257afa8-6265-4cb8-b73f-d0ee692d9b6a
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_4257afa8-6265-4cb8-b73f-d0ee692d9b6a","subject":"Private","status":"open","region":"eu","participants":["qa-130b9c638a2c","qa-9926f9774bb0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:22.039425991Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1b315dcd-fb7a-4200-a751-51dd6399c0ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b315dcd-fb7a-4200-a751-51dd6399c0ce
Content-Type: application/json

--- request body ---
{"handle":"qa-015586bc49e2","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b315dcd-fb7a-4200-a751-51dd6399c0ce
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78bf8e45-9004-479c-b839-268b595358bd"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4257afa8-6265-4cb8-b73f-d0ee692d9b6a
correlation: qa-20873897-9047-4e7f-924a-eb3c860bff1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20873897-9047-4e7f-924a-eb3c860bff1b
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20873897-9047-4e7f-924a-eb3c860bff1b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4257afa8-6265-4cb8-b73f-d0ee692d9b6a","correlationId":"qa-20873897-9047-4e7f-924a-eb3c860bff1b"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_4257afa8-6265-4cb8-b73f-d0ee692d9b6a/messages
correlation: qa-49b95af6-74d5-4154-85ee-7499be419916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49b95af6-74d5-4154-85ee-7499be419916
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49b95af6-74d5-4154-85ee-7499be419916
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4257afa8-6265-4cb8-b73f-d0ee692d9b6a/messages","correlationId":"qa-49b95af6-74d5-4154-85ee-7499be419916"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_4257afa8-6265-4cb8-b73f-d0ee692d9b6a/messages
correlation: qa-57bbaac6-2579-4be8-a334-3e7a743ba852

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57bbaac6-2579-4be8-a334-3e7a743ba852
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57bbaac6-2579-4be8-a334-3e7a743ba852
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4257afa8-6265-4cb8-b73f-d0ee692d9b6a/messages","correlationId":"qa-57bbaac6-2579-4be8-a334-3e7a743ba852"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff8da63b-65a9-44e4-9b15-c4a6966bb7b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff8da63b-65a9-44e4-9b15-c4a6966bb7b5
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff8da63b-65a9-44e4-9b15-c4a6966bb7b5
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
correlation: qa-8a1f63f5-651b-4f8d-9464-ffd7bbd2b08a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a1f63f5-651b-4f8d-9464-ffd7bbd2b08a
Content-Type: application/json

--- request body ---
{"handle":"qa-015586bc49e2","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a1f63f5-651b-4f8d-9464-ffd7bbd2b08a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a1f63f5-651b-4f8d-9464-ffd7bbd2b08a"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b52ebc43-69d9-4db8-8aaf-1247e249f3d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b52ebc43-69d9-4db8-8aaf-1247e249f3d9
Content-Type: application/json

--- request body ---
{"handle":"qa-9926f9774bb0","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-b52ebc43-69d9-4db8-8aaf-1247e249f3d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3897fc1d-650f-48a3-be0a-d2cef47ce5ef"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea6282da-85c5-4f24-be32-7fe72660cd27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea6282da-85c5-4f24-be32-7fe72660cd27
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea6282da-85c5-4f24-be32-7fe72660cd27
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
correlation: qa-32c616b0-98b9-4bd2-90e4-08ff00d9e866

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32c616b0-98b9-4bd2-90e4-08ff00d9e866
Content-Type: application/json

--- request body ---
{"handle":"qa-9926f9774bb0","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32c616b0-98b9-4bd2-90e4-08ff00d9e866
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32c616b0-98b9-4bd2-90e4-08ff00d9e866"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45a1716b-8153-4c3d-be08-f336045f3b01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a1716b-8153-4c3d-be08-f336045f3b01
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45a1716b-8153-4c3d-be08-f336045f3b01
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
correlation: qa-d1568a56-7598-448e-8221-6d7b2cb4b555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1568a56-7598-448e-8221-6d7b2cb4b555
Content-Type: application/json

--- request body ---
{"handle":"qa-130b9c638a2c","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1568a56-7598-448e-8221-6d7b2cb4b555
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1568a56-7598-448e-8221-6d7b2cb4b555"}
```
