# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-01b94f93-c411-463f-a3c4-d651c2a3470f` |
| 2 | `POST /v1/accounts` | 201 | 7 | `qa-4e146a64-eb01-493f-bb73-43425d2a012c` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-b822f08e-84c8-4ed1-bf04-c81fad026810` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-980b2c42-119c-416c-af9f-e719d5b3ea17` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-fc52e97f-ea60-4a2a-a9f8-b2d1ee0fb6bb` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-65d1b524-ce99-460d-9931-42ca985f9c8c` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-04cb2af1-6351-4a09-a1f3-81ae571ffae6` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-6b631a77-ee26-45df-987e-a60deedfbca2` |
| 9 | `GET /v1/credits/balance` | 200 | 21 | `qa-11cbf903-3956-4319-9a01-cdad93d9d8e5` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 13 | `qa-de50dd10-0ed6-4cd7-8973-0e01343150bf` |
| 11 | `GET /v1/credits/ledger` | 200 | 22 | `qa-c096525f-a24a-4acc-83d9-170862140884` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-d905c1db-ecec-45de-a8fe-2b25a68710cb` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-bbd6987c-eb8f-4b9b-b27d-93ca82d0516d` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-5ca7aa39-3957-4543-b78c-4d5c43fa425b` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2c74fb18-f198-41d1-9a90-234959020de8` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-6c2a059f-530b-4f41-b211-a6a201ee2e7c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01b94f93-c411-463f-a3c4-d651c2a3470f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01b94f93-c411-463f-a3c4-d651c2a3470f
Content-Type: application/json

--- request body ---
{"handle":"qa-d801dbc50df0","displayName":"QA d801dbc50df0","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-01b94f93-c411-463f-a3c4-d651c2a3470f
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
Location: /v1/accounts/qa-d801dbc50df0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a49243b6-089a-41fa-af73-9ca078e7f2cf","handle":"qa-d801dbc50df0","displayName":"QA d801dbc50df0","region":"eu","role":"user","createdAt":"2026-11-17T10:50:11.729555100Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e146a64-eb01-493f-bb73-43425d2a012c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e146a64-eb01-493f-bb73-43425d2a012c
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf1b82943af","displayName":"QA 8bf1b82943af","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e146a64-eb01-493f-bb73-43425d2a012c
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
Location: /v1/accounts/qa-8bf1b82943af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d822199a-c7ee-44b5-8e79-7e80613ec757","handle":"qa-8bf1b82943af","displayName":"QA 8bf1b82943af","region":"eu","role":"user","createdAt":"2026-11-17T10:50:11.740989614Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b822f08e-84c8-4ed1-bf04-c81fad026810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b822f08e-84c8-4ed1-bf04-c81fad026810
Content-Type: application/json

--- request body ---
{"handle":"qa-d801dbc50df0","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b822f08e-84c8-4ed1-bf04-c81fad026810
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a49243b6-089a-41fa-af73-9ca078e7f2cf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-980b2c42-119c-416c-af9f-e719d5b3ea17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-980b2c42-119c-416c-af9f-e719d5b3ea17
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8bf1b82943af","subject":"Many messages","message":"1"}

--- response: 201 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-980b2c42-119c-416c-af9f-e719d5b3ea17
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
Location: /v1/conversations/cnv_97d7275d-bff1-49ab-a56e-111488e931e5
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_97d7275d-bff1-49ab-a56e-111488e931e5","subject":"Many messages","status":"open","region":"eu","participants":["qa-d801dbc50df0","qa-8bf1b82943af"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:11.772484951Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_97d7275d-bff1-49ab-a56e-111488e931e5/messages
correlation: qa-fc52e97f-ea60-4a2a-a9f8-b2d1ee0fb6bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc52e97f-ea60-4a2a-a9f8-b2d1ee0fb6bb
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc52e97f-ea60-4a2a-a9f8-b2d1ee0fb6bb
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
Content-Length: 192

{"id":"msg_09f6c202-9f75-4022-be85-b6ce8dfcf22e","conversationId":"cnv_97d7275d-bff1-49ab-a56e-111488e931e5","sender":"qa-d801dbc50df0","body":"2","createdAt":"2026-11-17T10:50:11.826728817Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_97d7275d-bff1-49ab-a56e-111488e931e5/messages
correlation: qa-65d1b524-ce99-460d-9931-42ca985f9c8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d1b524-ce99-460d-9931-42ca985f9c8c
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-65d1b524-ce99-460d-9931-42ca985f9c8c
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
Content-Length: 192

{"id":"msg_95e1f6d8-9dea-46d7-89d1-cf73194bc52a","conversationId":"cnv_97d7275d-bff1-49ab-a56e-111488e931e5","sender":"qa-d801dbc50df0","body":"3","createdAt":"2026-11-17T10:50:11.843136786Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_97d7275d-bff1-49ab-a56e-111488e931e5/messages
correlation: qa-04cb2af1-6351-4a09-a1f3-81ae571ffae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04cb2af1-6351-4a09-a1f3-81ae571ffae6
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-04cb2af1-6351-4a09-a1f3-81ae571ffae6
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
Content-Length: 192

{"id":"msg_0d606801-4e6a-4480-b6e5-b52e3de14d42","conversationId":"cnv_97d7275d-bff1-49ab-a56e-111488e931e5","sender":"qa-d801dbc50df0","body":"4","createdAt":"2026-11-17T10:50:11.857988192Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_97d7275d-bff1-49ab-a56e-111488e931e5/messages
correlation: qa-6b631a77-ee26-45df-987e-a60deedfbca2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b631a77-ee26-45df-987e-a60deedfbca2
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b631a77-ee26-45df-987e-a60deedfbca2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_ce2c5bb9-a779-4129-9e3f-33c5f3fa4f62","conversationId":"cnv_97d7275d-bff1-49ab-a56e-111488e931e5","sender":"qa-d801dbc50df0","body":"5","createdAt":"2026-11-17T10:50:11.897269946Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-11cbf903-3956-4319-9a01-cdad93d9d8e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11cbf903-3956-4319-9a01-cdad93d9d8e5
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-11cbf903-3956-4319-9a01-cdad93d9d8e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_a49243b6-089a-41fa-af73-9ca078e7f2cf"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_97d7275d-bff1-49ab-a56e-111488e931e5/messages
correlation: qa-de50dd10-0ed6-4cd7-8973-0e01343150bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de50dd10-0ed6-4cd7-8973-0e01343150bf
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de50dd10-0ed6-4cd7-8973-0e01343150bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_97d7275d-bff1-49ab-a56e-111488e931e5/messages","correlationId":"qa-de50dd10-0ed6-4cd7-8973-0e01343150bf"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c096525f-a24a-4acc-83d9-170862140884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c096525f-a24a-4acc-83d9-170862140884
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c096525f-a24a-4acc-83d9-170862140884
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_2b76569c-6747-47c7-a19c-84e098cc2744","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-17T10:50:11.729569071Z"},{"id":"led_2485774f-0a0c-4ea2-b81b-9dc07a2311a3","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_97d7275d-bff1-49ab-a56e-111488e931e5","createdAt":"2026-11-17T10:50:11.772314506Z"},{"id":"led_e4cd2ff9-0f3b-4d92-9386-2f05d91800f3","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_09f6c202-9f75-4022-be85-b6ce8dfcf22e","createdAt":"2026-11-17T10:50:11.826703429Z"},{"id":"led_b2a76709-b919-4ec6-afbd-561c5f1eb247","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_95e1f6d8-9dea-46d7-89d1-cf73194bc52a","createdAt":"2026-11-17T10:50:11.843115494Z"},{"id":"led_f756ca22-a0d0-41a1-9fac-c3d3ca8f3387","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_0d606801-4e6a-4480-b6e5-b52e3de14d42","createdAt":"2026-11-17T10:50:11.857963736Z"},{"id":"led_9687490d-1ef0-4524-a1c9-ef07546131d3","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_ce2c5bb9-a779-4129-9e3f-33c5f3fa4f62","createdAt":"2026-11-17T10:50:11.897235865Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d905c1db-ecec-45de-a8fe-2b25a68710cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d905c1db-ecec-45de-a8fe-2b25a68710cb
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf1b82943af","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d905c1db-ecec-45de-a8fe-2b25a68710cb
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d822199a-c7ee-44b5-8e79-7e80613ec757"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bbd6987c-eb8f-4b9b-b27d-93ca82d0516d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbd6987c-eb8f-4b9b-b27d-93ca82d0516d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bbd6987c-eb8f-4b9b-b27d-93ca82d0516d
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
correlation: qa-5ca7aa39-3957-4543-b78c-4d5c43fa425b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ca7aa39-3957-4543-b78c-4d5c43fa425b
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf1b82943af","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ca7aa39-3957-4543-b78c-4d5c43fa425b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ca7aa39-3957-4543-b78c-4d5c43fa425b"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c74fb18-f198-41d1-9a90-234959020de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c74fb18-f198-41d1-9a90-234959020de8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c74fb18-f198-41d1-9a90-234959020de8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-6c2a059f-530b-4f41-b211-a6a201ee2e7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2a059f-530b-4f41-b211-a6a201ee2e7c
Content-Type: application/json

--- request body ---
{"handle":"qa-d801dbc50df0","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c2a059f-530b-4f41-b211-a6a201ee2e7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c2a059f-530b-4f41-b211-a6a201ee2e7c"}
```
