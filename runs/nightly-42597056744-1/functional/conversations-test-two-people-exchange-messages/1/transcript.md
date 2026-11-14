# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 419 | `qa-0bfb8220-c6c2-45a4-87fb-395307be465d` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-3a3ab41b-d476-4925-8e94-0c2a899754dc` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-8a7f3483-9691-466d-a5e9-34b6cf6adc6a` |
| 4 | `POST /v1/conversations` | 201 | 77 | `qa-7a98ae52-bd2f-46e1-ae46-94bb0f0d48f4` |
| 5 | `POST /v1/auth/token` | 200 | 32 | `qa-9b7d5c9d-fc7a-4f0f-bf4e-fabe17f20180` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-44451dd0-f46e-404e-b54a-4ee61f29ae87` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-50c28176-2a89-4aa2-ac4e-9fd06ad4bb8c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0b63f31e-f22f-4978-88bf-1258bf79784f` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-68c00b2a-ffc2-45e3-831e-07ad1b9bec61` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-5fd6e330-6f99-4cf9-abeb-c29066f0125f` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-35f0fe05-c7f0-43b2-b2f6-adbc576bb953` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0bfb8220-c6c2-45a4-87fb-395307be465d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bfb8220-c6c2-45a4-87fb-395307be465d
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b36bbe5655","displayName":"QA e5b36bbe5655","password":"****","region":"eu"}

--- response: 201 in 419 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bfb8220-c6c2-45a4-87fb-395307be465d
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
Location: /v1/accounts/qa-e5b36bbe5655
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce80030c-2f84-4573-b581-9e7e9699ef88","handle":"qa-e5b36bbe5655","displayName":"QA e5b36bbe5655","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.936347046Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a3ab41b-d476-4925-8e94-0c2a899754dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a3ab41b-d476-4925-8e94-0c2a899754dc
Content-Type: application/json

--- request body ---
{"handle":"qa-a362dd62a2c9","displayName":"QA a362dd62a2c9","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a3ab41b-d476-4925-8e94-0c2a899754dc
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
Location: /v1/accounts/qa-a362dd62a2c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_530a81f8-3c3a-45c8-8857-9b572c157d42","handle":"qa-a362dd62a2c9","displayName":"QA a362dd62a2c9","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.326443685Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8a7f3483-9691-466d-a5e9-34b6cf6adc6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a7f3483-9691-466d-a5e9-34b6cf6adc6a
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b36bbe5655","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a7f3483-9691-466d-a5e9-34b6cf6adc6a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce80030c-2f84-4573-b581-9e7e9699ef88"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7a98ae52-bd2f-46e1-ae46-94bb0f0d48f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a98ae52-bd2f-46e1-ae46-94bb0f0d48f4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a362dd62a2c9","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 77 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a98ae52-bd2f-46e1-ae46-94bb0f0d48f4
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
Location: /v1/conversations/cnv_39d2df75-758b-420e-8fda-4ea6fc8b9d85
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_39d2df75-758b-420e-8fda-4ea6fc8b9d85","subject":"Lunch?","status":"open","region":"eu","participants":["qa-e5b36bbe5655","qa-a362dd62a2c9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:55:59.510205419Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9b7d5c9d-fc7a-4f0f-bf4e-fabe17f20180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b7d5c9d-fc7a-4f0f-bf4e-fabe17f20180
Content-Type: application/json

--- request body ---
{"handle":"qa-a362dd62a2c9","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b7d5c9d-fc7a-4f0f-bf4e-fabe17f20180
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_530a81f8-3c3a-45c8-8857-9b572c157d42"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_39d2df75-758b-420e-8fda-4ea6fc8b9d85/messages
correlation: qa-44451dd0-f46e-404e-b54a-4ee61f29ae87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44451dd0-f46e-404e-b54a-4ee61f29ae87
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-44451dd0-f46e-404e-b54a-4ee61f29ae87
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
Content-Length: 203

{"id":"msg_a83bc425-0077-4e1c-880d-69eb49998bf1","conversationId":"cnv_39d2df75-758b-420e-8fda-4ea6fc8b9d85","sender":"qa-a362dd62a2c9","body":"Friday works","createdAt":"2026-11-09T09:55:59.665438660Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_39d2df75-758b-420e-8fda-4ea6fc8b9d85/messages
correlation: qa-50c28176-2a89-4aa2-ac4e-9fd06ad4bb8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50c28176-2a89-4aa2-ac4e-9fd06ad4bb8c
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-50c28176-2a89-4aa2-ac4e-9fd06ad4bb8c
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
Content-Length: 432

{"items":[{"id":"msg_4d7806c1-8a20-4b2c-925b-572dee245578","conversationId":"cnv_39d2df75-758b-420e-8fda-4ea6fc8b9d85","sender":"qa-e5b36bbe5655","body":"Free on Friday?","createdAt":"2026-11-09T09:55:59.510624851Z"},{"id":"msg_a83bc425-0077-4e1c-880d-69eb49998bf1","conversationId":"cnv_39d2df75-758b-420e-8fda-4ea6fc8b9d85","sender":"qa-a362dd62a2c9","body":"Friday works","createdAt":"2026-11-09T09:55:59.665438660Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b63f31e-f22f-4978-88bf-1258bf79784f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b63f31e-f22f-4978-88bf-1258bf79784f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b63f31e-f22f-4978-88bf-1258bf79784f
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
correlation: qa-68c00b2a-ffc2-45e3-831e-07ad1b9bec61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68c00b2a-ffc2-45e3-831e-07ad1b9bec61
Content-Type: application/json

--- request body ---
{"handle":"qa-a362dd62a2c9","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68c00b2a-ffc2-45e3-831e-07ad1b9bec61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68c00b2a-ffc2-45e3-831e-07ad1b9bec61"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fd6e330-6f99-4cf9-abeb-c29066f0125f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd6e330-6f99-4cf9-abeb-c29066f0125f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fd6e330-6f99-4cf9-abeb-c29066f0125f
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-35f0fe05-c7f0-43b2-b2f6-adbc576bb953

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35f0fe05-c7f0-43b2-b2f6-adbc576bb953
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b36bbe5655","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35f0fe05-c7f0-43b2-b2f6-adbc576bb953
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35f0fe05-c7f0-43b2-b2f6-adbc576bb953"}
```
