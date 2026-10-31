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
| 1 | `POST /v1/accounts` | 201 | 419 | `qa-b3affe07-e755-4155-82e1-3609c36b7d28` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-74b359d8-3cf1-4e63-838c-59bee1a2f1df` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-ddd7bc31-99a7-46e4-97d9-a285f5738aff` |
| 4 | `POST /v1/conversations` | 201 | 53 | `qa-bcca2655-4707-4a00-8d9b-a0044b9a46aa` |
| 5 | `POST /v1/auth/token` | 200 | 13 | `qa-473a9dee-69c2-42cd-87cd-4fbc725304e2` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-a4c2ed1e-95d4-4f61-89f9-e90b388f515b` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 26 | `qa-be1ac2cc-239f-4a0e-88a0-c3d3e3f63172` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-fc59956b-06f1-4c9d-9593-269a75717e5e` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-27fd060f-c578-434e-9919-ecffbbe75e7d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-44bd1dbf-fec2-4072-8229-1a7b43c9cd2c` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-65a8b720-08e8-4d6d-aac8-672c99861134` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3affe07-e755-4155-82e1-3609c36b7d28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3affe07-e755-4155-82e1-3609c36b7d28
Content-Type: application/json

--- request body ---
{"handle":"qa-eafcd85cdf8a","displayName":"QA eafcd85cdf8a","password":"****","region":"eu"}

--- response: 201 in 419 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3affe07-e755-4155-82e1-3609c36b7d28
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
Location: /v1/accounts/qa-eafcd85cdf8a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_76ac7fa9-3fa3-41b1-bbf8-1ccb0c94dd7b","handle":"qa-eafcd85cdf8a","displayName":"QA eafcd85cdf8a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.470745647Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-74b359d8-3cf1-4e63-838c-59bee1a2f1df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74b359d8-3cf1-4e63-838c-59bee1a2f1df
Content-Type: application/json

--- request body ---
{"handle":"qa-ba5beb370377","displayName":"QA ba5beb370377","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-74b359d8-3cf1-4e63-838c-59bee1a2f1df
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
Location: /v1/accounts/qa-ba5beb370377
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4e7bf95-84b4-4cd5-bff2-ff8e138dee6e","handle":"qa-ba5beb370377","displayName":"QA ba5beb370377","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.877590447Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ddd7bc31-99a7-46e4-97d9-a285f5738aff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddd7bc31-99a7-46e4-97d9-a285f5738aff
Content-Type: application/json

--- request body ---
{"handle":"qa-eafcd85cdf8a","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddd7bc31-99a7-46e4-97d9-a285f5738aff
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76ac7fa9-3fa3-41b1-bbf8-1ccb0c94dd7b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bcca2655-4707-4a00-8d9b-a0044b9a46aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcca2655-4707-4a00-8d9b-a0044b9a46aa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ba5beb370377","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 53 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcca2655-4707-4a00-8d9b-a0044b9a46aa
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
Location: /v1/conversations/cnv_804fd8f0-410a-4245-aca8-30dbab20d4ed
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_804fd8f0-410a-4245-aca8-30dbab20d4ed","subject":"Lunch?","status":"open","region":"eu","participants":["qa-eafcd85cdf8a","qa-ba5beb370377"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.020316297Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-473a9dee-69c2-42cd-87cd-4fbc725304e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-473a9dee-69c2-42cd-87cd-4fbc725304e2
Content-Type: application/json

--- request body ---
{"handle":"qa-ba5beb370377","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-473a9dee-69c2-42cd-87cd-4fbc725304e2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4e7bf95-84b4-4cd5-bff2-ff8e138dee6e"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_804fd8f0-410a-4245-aca8-30dbab20d4ed/messages
correlation: qa-a4c2ed1e-95d4-4f61-89f9-e90b388f515b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4c2ed1e-95d4-4f61-89f9-e90b388f515b
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4c2ed1e-95d4-4f61-89f9-e90b388f515b
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

{"id":"msg_3d2888ac-2f08-49c0-8d45-556f269f7937","conversationId":"cnv_804fd8f0-410a-4245-aca8-30dbab20d4ed","sender":"qa-ba5beb370377","body":"Friday works","createdAt":"2026-10-31T08:31:35.142618924Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_804fd8f0-410a-4245-aca8-30dbab20d4ed/messages
correlation: qa-be1ac2cc-239f-4a0e-88a0-c3d3e3f63172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be1ac2cc-239f-4a0e-88a0-c3d3e3f63172
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-be1ac2cc-239f-4a0e-88a0-c3d3e3f63172
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

{"items":[{"id":"msg_6e3fe9c7-77ef-4af9-9c0a-9dfd7716b302","conversationId":"cnv_804fd8f0-410a-4245-aca8-30dbab20d4ed","sender":"qa-eafcd85cdf8a","body":"Free on Friday?","createdAt":"2026-10-31T08:31:35.020561830Z"},{"id":"msg_3d2888ac-2f08-49c0-8d45-556f269f7937","conversationId":"cnv_804fd8f0-410a-4245-aca8-30dbab20d4ed","sender":"qa-ba5beb370377","body":"Friday works","createdAt":"2026-10-31T08:31:35.142618924Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc59956b-06f1-4c9d-9593-269a75717e5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc59956b-06f1-4c9d-9593-269a75717e5e
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc59956b-06f1-4c9d-9593-269a75717e5e
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
correlation: qa-27fd060f-c578-434e-9919-ecffbbe75e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27fd060f-c578-434e-9919-ecffbbe75e7d
Content-Type: application/json

--- request body ---
{"handle":"qa-ba5beb370377","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27fd060f-c578-434e-9919-ecffbbe75e7d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27fd060f-c578-434e-9919-ecffbbe75e7d"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-44bd1dbf-fec2-4072-8229-1a7b43c9cd2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44bd1dbf-fec2-4072-8229-1a7b43c9cd2c
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-44bd1dbf-fec2-4072-8229-1a7b43c9cd2c
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
correlation: qa-65a8b720-08e8-4d6d-aac8-672c99861134

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65a8b720-08e8-4d6d-aac8-672c99861134
Content-Type: application/json

--- request body ---
{"handle":"qa-eafcd85cdf8a","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65a8b720-08e8-4d6d-aac8-672c99861134
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65a8b720-08e8-4d6d-aac8-672c99861134"}
```
