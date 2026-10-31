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
| 1 | `POST /v1/accounts` | 201 | 461 | `qa-e3a02b12-9802-467b-9ec3-b3bdc3215c75` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-61853fdd-e8c2-4a0a-bd61-d1430fc55ce6` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-d072cc65-a3ed-472a-8830-93565584e211` |
| 4 | `POST /v1/conversations` | 201 | 54 | `qa-5653d1a5-8cdf-420f-be65-735afe6ede38` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 32 | `qa-a2bb01ad-0e1e-479a-b18b-51fd5512774d` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-1ee22f2f-bdf8-4747-899b-9c33bb1c9bc5` |
| 7 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-3e57b836-bd77-4140-8631-b46e32389d59` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-23e9b634-8c02-4891-a176-3b04ea9aadc0` |
| 9 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-64b66143-4ce2-4e60-8dc5-08cfcee73b7b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-7a199f13-08dd-475a-9e02-d383d4b694b3` |
| 11 | `POST /v1/auth/token` | 401 | 23 | `qa-71acbd5c-8099-4ec5-86da-0b6605eb3cc2` |
| 12 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-e225672d-94fa-496e-9fc7-4220e4fab767` |
| 13 | `POST /v1/auth/token` | 401 | 10 | `qa-629465d5-23d1-40d5-92d8-9a51e4d5b09e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e3a02b12-9802-467b-9ec3-b3bdc3215c75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3a02b12-9802-467b-9ec3-b3bdc3215c75
Content-Type: application/json

--- request body ---
{"handle":"qa-03dbcc050c62","displayName":"QA 03dbcc050c62","password":"****","region":"eu"}

--- response: 201 in 461 ms ---
Date: Fri, 23 Oct 2026 07:42:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3a02b12-9802-467b-9ec3-b3bdc3215c75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-03dbcc050c62
X-Served-Region: eu
Content-Length: 181

{"id":"acc_946f3af0-6247-4605-ab07-43fbdfc8b93f","handle":"qa-03dbcc050c62","displayName":"QA 03dbcc050c62","region":"eu","role":"user","createdAt":"2026-10-23T07:42:02.981671833Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-61853fdd-e8c2-4a0a-bd61-d1430fc55ce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61853fdd-e8c2-4a0a-bd61-d1430fc55ce6
Content-Type: application/json

--- request body ---
{"handle":"qa-620cc8abebbf","displayName":"QA 620cc8abebbf","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-61853fdd-e8c2-4a0a-bd61-d1430fc55ce6
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
Location: /v1/accounts/qa-620cc8abebbf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b5e8bbe-11ef-4303-87b4-7e5fe237187d","handle":"qa-620cc8abebbf","displayName":"QA 620cc8abebbf","region":"eu","role":"user","createdAt":"2026-10-23T07:42:03.478957622Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d072cc65-a3ed-472a-8830-93565584e211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d072cc65-a3ed-472a-8830-93565584e211
Content-Type: application/json

--- request body ---
{"handle":"qa-03dbcc050c62","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d072cc65-a3ed-472a-8830-93565584e211
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_946f3af0-6247-4605-ab07-43fbdfc8b93f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5653d1a5-8cdf-420f-be65-735afe6ede38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5653d1a5-8cdf-420f-be65-735afe6ede38
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-620cc8abebbf","subject":"Updates","message":"First"}

--- response: 201 in 54 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5653d1a5-8cdf-420f-be65-735afe6ede38
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
Location: /v1/conversations/cnv_252193f4-6006-4e61-b567-d48ed7b2d695
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_252193f4-6006-4e61-b567-d48ed7b2d695","subject":"Updates","status":"open","region":"eu","participants":["qa-03dbcc050c62","qa-620cc8abebbf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:42:03.660817922Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_252193f4-6006-4e61-b567-d48ed7b2d695/messages
correlation: qa-a2bb01ad-0e1e-479a-b18b-51fd5512774d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2bb01ad-0e1e-479a-b18b-51fd5512774d
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 32 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2bb01ad-0e1e-479a-b18b-51fd5512774d
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

{"id":"msg_895adf3c-8b5e-457d-b89d-ab0843d04855","conversationId":"cnv_252193f4-6006-4e61-b567-d48ed7b2d695","sender":"qa-03dbcc050c62","body":"Second","createdAt":"2026-10-23T07:42:03.762183674Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1ee22f2f-bdf8-4747-899b-9c33bb1c9bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ee22f2f-bdf8-4747-899b-9c33bb1c9bc5
Content-Type: application/json

--- request body ---
{"handle":"qa-620cc8abebbf","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ee22f2f-bdf8-4747-899b-9c33bb1c9bc5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b5e8bbe-11ef-4303-87b4-7e5fe237187d"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_252193f4-6006-4e61-b567-d48ed7b2d695
correlation: qa-3e57b836-bd77-4140-8631-b46e32389d59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e57b836-bd77-4140-8631-b46e32389d59
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e57b836-bd77-4140-8631-b46e32389d59
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

{"id":"cnv_252193f4-6006-4e61-b567-d48ed7b2d695","subject":"Updates","status":"open","region":"eu","participants":["qa-03dbcc050c62","qa-620cc8abebbf"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-23T07:42:03.660817922Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_252193f4-6006-4e61-b567-d48ed7b2d695/read
correlation: qa-23e9b634-8c02-4891-a176-3b04ea9aadc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e9b634-8c02-4891-a176-3b04ea9aadc0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-23e9b634-8c02-4891-a176-3b04ea9aadc0
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

{"conversationId":"cnv_252193f4-6006-4e61-b567-d48ed7b2d695","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_252193f4-6006-4e61-b567-d48ed7b2d695
correlation: qa-64b66143-4ce2-4e60-8dc5-08cfcee73b7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b66143-4ce2-4e60-8dc5-08cfcee73b7b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b66143-4ce2-4e60-8dc5-08cfcee73b7b
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

{"id":"cnv_252193f4-6006-4e61-b567-d48ed7b2d695","subject":"Updates","status":"open","region":"eu","participants":["qa-03dbcc050c62","qa-620cc8abebbf"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-23T07:42:03.660817922Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a199f13-08dd-475a-9e02-d383d4b694b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a199f13-08dd-475a-9e02-d383d4b694b3
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a199f13-08dd-475a-9e02-d383d4b694b3
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
correlation: qa-71acbd5c-8099-4ec5-86da-0b6605eb3cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71acbd5c-8099-4ec5-86da-0b6605eb3cc2
Content-Type: application/json

--- request body ---
{"handle":"qa-620cc8abebbf","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71acbd5c-8099-4ec5-86da-0b6605eb3cc2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71acbd5c-8099-4ec5-86da-0b6605eb3cc2"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e225672d-94fa-496e-9fc7-4220e4fab767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e225672d-94fa-496e-9fc7-4220e4fab767
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e225672d-94fa-496e-9fc7-4220e4fab767
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
correlation: qa-629465d5-23d1-40d5-92d8-9a51e4d5b09e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-629465d5-23d1-40d5-92d8-9a51e4d5b09e
Content-Type: application/json

--- request body ---
{"handle":"qa-03dbcc050c62","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-629465d5-23d1-40d5-92d8-9a51e4d5b09e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-629465d5-23d1-40d5-92d8-9a51e4d5b09e"}
```
