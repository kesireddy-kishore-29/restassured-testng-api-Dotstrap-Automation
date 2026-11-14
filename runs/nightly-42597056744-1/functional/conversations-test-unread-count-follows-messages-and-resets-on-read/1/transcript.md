# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 486 | `qa-c1bf7123-4fe2-4fad-8918-c2bc6953a4e5` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-07522fc3-5545-455a-a5db-a2e0519d2e42` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-09796c2e-31e6-4aea-8e0c-dc715cde44e7` |
| 4 | `POST /v1/conversations` | 201 | 59 | `qa-7fcf302e-fe3e-4ef1-af3a-26d2a2e1ada1` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 30 | `qa-b2666129-97f7-4857-91c4-3d095d701562` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-af9b0440-d58e-4b64-96c0-a3899541834d` |
| 7 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-e95d536a-320a-49ea-bc4e-8ca065949576` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 13 | `qa-bac8e0ba-2c09-416a-a2b7-8aa2319dfb85` |
| 9 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-8928cdd2-dc43-414b-886f-80686e381ea7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-1808b1d9-9265-4628-8551-2b4eb0ce582b` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-2bc09935-d54e-4825-8d98-25cf57025cbe` |
| 12 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-81aed43c-4187-494e-b789-a00fe3f2c997` |
| 13 | `POST /v1/auth/token` | 401 | 11 | `qa-a190ea88-7619-4b53-9749-97582e50f489` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c1bf7123-4fe2-4fad-8918-c2bc6953a4e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1bf7123-4fe2-4fad-8918-c2bc6953a4e5
Content-Type: application/json

--- request body ---
{"handle":"qa-70dc02cb68c6","displayName":"QA 70dc02cb68c6","password":"****","region":"eu"}

--- response: 201 in 486 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1bf7123-4fe2-4fad-8918-c2bc6953a4e5
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
Location: /v1/accounts/qa-70dc02cb68c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a73ddd8d-2063-4ee3-8871-ea6631969fec","handle":"qa-70dc02cb68c6","displayName":"QA 70dc02cb68c6","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.919098188Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-07522fc3-5545-455a-a5db-a2e0519d2e42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07522fc3-5545-455a-a5db-a2e0519d2e42
Content-Type: application/json

--- request body ---
{"handle":"qa-3c898af09f80","displayName":"QA 3c898af09f80","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-07522fc3-5545-455a-a5db-a2e0519d2e42
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
Location: /v1/accounts/qa-3c898af09f80
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ebd102c9-3a4e-4c3b-9d81-76abb8677bb1","handle":"qa-3c898af09f80","displayName":"QA 3c898af09f80","region":"eu","role":"user","createdAt":"2026-11-09T09:55:59.346633546Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-09796c2e-31e6-4aea-8e0c-dc715cde44e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09796c2e-31e6-4aea-8e0c-dc715cde44e7
Content-Type: application/json

--- request body ---
{"handle":"qa-70dc02cb68c6","password":"****"}

--- response: 200 in 44 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-09796c2e-31e6-4aea-8e0c-dc715cde44e7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a73ddd8d-2063-4ee3-8871-ea6631969fec"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7fcf302e-fe3e-4ef1-af3a-26d2a2e1ada1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fcf302e-fe3e-4ef1-af3a-26d2a2e1ada1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3c898af09f80","subject":"Updates","message":"First"}

--- response: 201 in 59 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fcf302e-fe3e-4ef1-af3a-26d2a2e1ada1
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
Location: /v1/conversations/cnv_1d6919f8-231a-403f-b874-214ac35b85eb
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_1d6919f8-231a-403f-b874-214ac35b85eb","subject":"Updates","status":"open","region":"eu","participants":["qa-70dc02cb68c6","qa-3c898af09f80"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:55:59.514269127Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1d6919f8-231a-403f-b874-214ac35b85eb/messages
correlation: qa-b2666129-97f7-4857-91c4-3d095d701562

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2666129-97f7-4857-91c4-3d095d701562
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 30 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2666129-97f7-4857-91c4-3d095d701562
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
Content-Length: 197

{"id":"msg_0e45afe4-2997-4d23-9d5b-00a7886b6204","conversationId":"cnv_1d6919f8-231a-403f-b874-214ac35b85eb","sender":"qa-70dc02cb68c6","body":"Second","createdAt":"2026-11-09T09:55:59.643288896Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-af9b0440-d58e-4b64-96c0-a3899541834d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af9b0440-d58e-4b64-96c0-a3899541834d
Content-Type: application/json

--- request body ---
{"handle":"qa-3c898af09f80","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-af9b0440-d58e-4b64-96c0-a3899541834d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ebd102c9-3a4e-4c3b-9d81-76abb8677bb1"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_1d6919f8-231a-403f-b874-214ac35b85eb
correlation: qa-e95d536a-320a-49ea-bc4e-8ca065949576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e95d536a-320a-49ea-bc4e-8ca065949576
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e95d536a-320a-49ea-bc4e-8ca065949576
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_1d6919f8-231a-403f-b874-214ac35b85eb","subject":"Updates","status":"open","region":"eu","participants":["qa-70dc02cb68c6","qa-3c898af09f80"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-09T09:55:59.514269127Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_1d6919f8-231a-403f-b874-214ac35b85eb/read
correlation: qa-bac8e0ba-2c09-416a-a2b7-8aa2319dfb85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac8e0ba-2c09-416a-a2b7-8aa2319dfb85
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bac8e0ba-2c09-416a-a2b7-8aa2319dfb85
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
Content-Length: 77

{"conversationId":"cnv_1d6919f8-231a-403f-b874-214ac35b85eb","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_1d6919f8-231a-403f-b874-214ac35b85eb
correlation: qa-8928cdd2-dc43-414b-886f-80686e381ea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8928cdd2-dc43-414b-886f-80686e381ea7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8928cdd2-dc43-414b-886f-80686e381ea7
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_1d6919f8-231a-403f-b874-214ac35b85eb","subject":"Updates","status":"open","region":"eu","participants":["qa-70dc02cb68c6","qa-3c898af09f80"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-09T09:55:59.514269127Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1808b1d9-9265-4628-8551-2b4eb0ce582b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1808b1d9-9265-4628-8551-2b4eb0ce582b
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1808b1d9-9265-4628-8551-2b4eb0ce582b
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
correlation: qa-2bc09935-d54e-4825-8d98-25cf57025cbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc09935-d54e-4825-8d98-25cf57025cbe
Content-Type: application/json

--- request body ---
{"handle":"qa-3c898af09f80","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bc09935-d54e-4825-8d98-25cf57025cbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bc09935-d54e-4825-8d98-25cf57025cbe"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81aed43c-4187-494e-b789-a00fe3f2c997

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81aed43c-4187-494e-b789-a00fe3f2c997
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81aed43c-4187-494e-b789-a00fe3f2c997
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

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-a190ea88-7619-4b53-9749-97582e50f489

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a190ea88-7619-4b53-9749-97582e50f489
Content-Type: application/json

--- request body ---
{"handle":"qa-70dc02cb68c6","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a190ea88-7619-4b53-9749-97582e50f489
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a190ea88-7619-4b53-9749-97582e50f489"}
```
