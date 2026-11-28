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
| 1 | `POST /v1/accounts` | 201 | 421 | `qa-2a08221c-8221-4b07-9c9e-37ae2fa6df14` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-35282bc8-2f7c-4a53-be11-396c98993c30` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-9e0a9523-c0de-4254-a810-258c889f89b8` |
| 4 | `POST /v1/conversations` | 201 | 49 | `qa-471ff0da-81f3-47e3-b1ee-8652437f05c4` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 42 | `qa-6b45356c-38a1-4704-afa7-1b88bf6a5c4c` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-797a40e0-179c-47ca-aed2-58aac01565f1` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-19a1d921-ee50-4152-b588-c1ba2c506ea3` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 16 | `qa-e9cc908e-88e9-436a-a3a6-08657262a40f` |
| 9 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-03ffd1d3-f9ee-4760-88a8-34fa37950db7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b1db3945-afdd-4d52-bf7d-4a91f405d066` |
| 11 | `POST /v1/auth/token` | 401 | 17 | `qa-0fdd028f-a78c-4fa5-aeea-38848b56c0dd` |
| 12 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-6bda951f-5d4b-42fd-853d-074e40b04560` |
| 13 | `POST /v1/auth/token` | 401 | 16 | `qa-2d308afb-0672-47aa-9c09-73fac8a0bb86` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2a08221c-8221-4b07-9c9e-37ae2fa6df14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a08221c-8221-4b07-9c9e-37ae2fa6df14
Content-Type: application/json

--- request body ---
{"handle":"qa-fd97948caec5","displayName":"QA fd97948caec5","password":"****","region":"eu"}

--- response: 201 in 421 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a08221c-8221-4b07-9c9e-37ae2fa6df14
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
Location: /v1/accounts/qa-fd97948caec5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5199fbb-3beb-4a88-859e-c6a7003ba1aa","handle":"qa-fd97948caec5","displayName":"QA fd97948caec5","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.262723813Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-35282bc8-2f7c-4a53-be11-396c98993c30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35282bc8-2f7c-4a53-be11-396c98993c30
Content-Type: application/json

--- request body ---
{"handle":"qa-d5a2c7f4b8a0","displayName":"QA d5a2c7f4b8a0","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-35282bc8-2f7c-4a53-be11-396c98993c30
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
Location: /v1/accounts/qa-d5a2c7f4b8a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_228eb792-4ec9-4c59-b35b-ea1b57677b72","handle":"qa-d5a2c7f4b8a0","displayName":"QA d5a2c7f4b8a0","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.785281094Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9e0a9523-c0de-4254-a810-258c889f89b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e0a9523-c0de-4254-a810-258c889f89b8
Content-Type: application/json

--- request body ---
{"handle":"qa-fd97948caec5","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e0a9523-c0de-4254-a810-258c889f89b8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5199fbb-3beb-4a88-859e-c6a7003ba1aa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-471ff0da-81f3-47e3-b1ee-8652437f05c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-471ff0da-81f3-47e3-b1ee-8652437f05c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d5a2c7f4b8a0","subject":"Updates","message":"First"}

--- response: 201 in 49 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-471ff0da-81f3-47e3-b1ee-8652437f05c4
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
Location: /v1/conversations/cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a","subject":"Updates","status":"open","region":"eu","participants":["qa-fd97948caec5","qa-d5a2c7f4b8a0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:02.924332141Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a/messages
correlation: qa-6b45356c-38a1-4704-afa7-1b88bf6a5c4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b45356c-38a1-4704-afa7-1b88bf6a5c4c
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 42 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b45356c-38a1-4704-afa7-1b88bf6a5c4c
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

{"id":"msg_b9efafd8-d42d-407d-8048-838156fca099","conversationId":"cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a","sender":"qa-fd97948caec5","body":"Second","createdAt":"2026-11-23T10:55:03.012603210Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-797a40e0-179c-47ca-aed2-58aac01565f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-797a40e0-179c-47ca-aed2-58aac01565f1
Content-Type: application/json

--- request body ---
{"handle":"qa-d5a2c7f4b8a0","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-797a40e0-179c-47ca-aed2-58aac01565f1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_228eb792-4ec9-4c59-b35b-ea1b57677b72"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a
correlation: qa-19a1d921-ee50-4152-b588-c1ba2c506ea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a1d921-ee50-4152-b588-c1ba2c506ea3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a1d921-ee50-4152-b588-c1ba2c506ea3
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

{"id":"cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a","subject":"Updates","status":"open","region":"eu","participants":["qa-fd97948caec5","qa-d5a2c7f4b8a0"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-23T10:55:02.924332141Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a/read
correlation: qa-e9cc908e-88e9-436a-a3a6-08657262a40f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9cc908e-88e9-436a-a3a6-08657262a40f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9cc908e-88e9-436a-a3a6-08657262a40f
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

{"conversationId":"cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a
correlation: qa-03ffd1d3-f9ee-4760-88a8-34fa37950db7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03ffd1d3-f9ee-4760-88a8-34fa37950db7
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-03ffd1d3-f9ee-4760-88a8-34fa37950db7
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

{"id":"cnv_922e4dcd-c2e6-4567-b0c5-40685fdc264a","subject":"Updates","status":"open","region":"eu","participants":["qa-fd97948caec5","qa-d5a2c7f4b8a0"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-23T10:55:02.924332141Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1db3945-afdd-4d52-bf7d-4a91f405d066

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1db3945-afdd-4d52-bf7d-4a91f405d066
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1db3945-afdd-4d52-bf7d-4a91f405d066
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
correlation: qa-0fdd028f-a78c-4fa5-aeea-38848b56c0dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fdd028f-a78c-4fa5-aeea-38848b56c0dd
Content-Type: application/json

--- request body ---
{"handle":"qa-d5a2c7f4b8a0","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fdd028f-a78c-4fa5-aeea-38848b56c0dd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0fdd028f-a78c-4fa5-aeea-38848b56c0dd"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6bda951f-5d4b-42fd-853d-074e40b04560

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bda951f-5d4b-42fd-853d-074e40b04560
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6bda951f-5d4b-42fd-853d-074e40b04560
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
correlation: qa-2d308afb-0672-47aa-9c09-73fac8a0bb86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d308afb-0672-47aa-9c09-73fac8a0bb86
Content-Type: application/json

--- request body ---
{"handle":"qa-fd97948caec5","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d308afb-0672-47aa-9c09-73fac8a0bb86
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d308afb-0672-47aa-9c09-73fac8a0bb86"}
```
