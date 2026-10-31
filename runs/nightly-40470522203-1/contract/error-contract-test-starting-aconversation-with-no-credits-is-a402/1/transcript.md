# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-8313f0d2-fff4-4b93-9aaa-d88d65e98ae2` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-1fd5d773-813c-43b9-8042-789864811fec` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-417d3e80-178a-41cf-b564-4fae76fbbcad` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-05cee781-066d-46f2-b482-6f854d92b50c` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-3c6c2793-175c-4ff5-bcaf-bbb63d45d56a` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-8d47b277-9ff3-4aa8-b1a8-385860e52098` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-e394ef85-d39e-4663-99ef-7e6b197bb350` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 25 | `qa-d8f81997-672f-49b3-bbae-7f96abbff050` |
| 9 | `GET /v1/credits/balance` | 200 | 15 | `qa-f0585701-3297-425f-a238-fbe08b94d9d7` |
| 10 | `POST /v1/conversations` | 402 | 18 | `qa-dbeca800-ed8f-4724-aeee-c12daa8a630f` |
| 11 | `GET /v1/credits/ledger` | 200 | 7 | `qa-783e212f-3f9b-45c5-97df-2ebaf9ada3e8` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-782d7b34-01c7-4572-a458-2bbf6462e6ae` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ed6614c3-b93b-4095-b790-7e9ade3bdf37` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-db2c8b8d-0a56-4e82-a95a-9994a174b3d5` |
| 15 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-68009936-5290-442d-90fb-444d3b54981a` |
| 16 | `POST /v1/auth/token` | 401 | 11 | `qa-18a7c6bc-bf5c-4271-b018-e035bdd3d15e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8313f0d2-fff4-4b93-9aaa-d88d65e98ae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8313f0d2-fff4-4b93-9aaa-d88d65e98ae2
Content-Type: application/json

--- request body ---
{"handle":"qa-7e2b8fe9a91a","displayName":"QA 7e2b8fe9a91a","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8313f0d2-fff4-4b93-9aaa-d88d65e98ae2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Location: /v1/accounts/qa-7e2b8fe9a91a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_772e6c77-329d-4328-8696-9b32d7642db8","handle":"qa-7e2b8fe9a91a","displayName":"QA 7e2b8fe9a91a","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.065857519Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1fd5d773-813c-43b9-8042-789864811fec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fd5d773-813c-43b9-8042-789864811fec
Content-Type: application/json

--- request body ---
{"handle":"qa-3551e22a57b1","displayName":"QA 3551e22a57b1","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fd5d773-813c-43b9-8042-789864811fec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Location: /v1/accounts/qa-3551e22a57b1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eca09ae1-7826-459b-8d1a-9c70ee34646b","handle":"qa-3551e22a57b1","displayName":"QA 3551e22a57b1","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.109496517Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-417d3e80-178a-41cf-b564-4fae76fbbcad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-417d3e80-178a-41cf-b564-4fae76fbbcad
Content-Type: application/json

--- request body ---
{"handle":"qa-7e2b8fe9a91a","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-417d3e80-178a-41cf-b564-4fae76fbbcad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_772e6c77-329d-4328-8696-9b32d7642db8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-05cee781-066d-46f2-b482-6f854d92b50c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05cee781-066d-46f2-b482-6f854d92b50c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3551e22a57b1","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-05cee781-066d-46f2-b482-6f854d92b50c
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
Location: /v1/conversations/cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de","subject":"Error contract","status":"open","region":"eu","participants":["qa-7e2b8fe9a91a","qa-3551e22a57b1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.170546385Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de/messages
correlation: qa-3c6c2793-175c-4ff5-bcaf-bbb63d45d56a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c6c2793-175c-4ff5-bcaf-bbb63d45d56a
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c6c2793-175c-4ff5-bcaf-bbb63d45d56a
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

{"id":"msg_cd07dff6-aa7a-4acb-a09c-6dfc49038d35","conversationId":"cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de","sender":"qa-7e2b8fe9a91a","body":"2","createdAt":"2026-10-27T08:00:35.204652811Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de/messages
correlation: qa-8d47b277-9ff3-4aa8-b1a8-385860e52098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d47b277-9ff3-4aa8-b1a8-385860e52098
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d47b277-9ff3-4aa8-b1a8-385860e52098
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

{"id":"msg_0d944119-2220-482a-b178-006171f6f56a","conversationId":"cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de","sender":"qa-7e2b8fe9a91a","body":"3","createdAt":"2026-10-27T08:00:35.243905693Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de/messages
correlation: qa-e394ef85-d39e-4663-99ef-7e6b197bb350

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e394ef85-d39e-4663-99ef-7e6b197bb350
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e394ef85-d39e-4663-99ef-7e6b197bb350
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

{"id":"msg_0e774bd9-dbd5-4b68-a4ba-bebb1fac050d","conversationId":"cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de","sender":"qa-7e2b8fe9a91a","body":"4","createdAt":"2026-10-27T08:00:35.291369286Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de/messages
correlation: qa-d8f81997-672f-49b3-bbae-7f96abbff050

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f81997-672f-49b3-bbae-7f96abbff050
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8f81997-672f-49b3-bbae-7f96abbff050
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

{"id":"msg_447c9163-88d7-4757-840d-6eb44f2a3655","conversationId":"cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de","sender":"qa-7e2b8fe9a91a","body":"5","createdAt":"2026-10-27T08:00:35.332506115Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-f0585701-3297-425f-a238-fbe08b94d9d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0585701-3297-425f-a238-fbe08b94d9d7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0585701-3297-425f-a238-fbe08b94d9d7
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

{"balance":0,"currency":"credits","accountId":"acc_772e6c77-329d-4328-8696-9b32d7642db8"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-dbeca800-ed8f-4724-aeee-c12daa8a630f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbeca800-ed8f-4724-aeee-c12daa8a630f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3551e22a57b1","subject":"One more","message":"Hi"}

--- response: 402 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbeca800-ed8f-4724-aeee-c12daa8a630f
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
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-dbeca800-ed8f-4724-aeee-c12daa8a630f"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-783e212f-3f9b-45c5-97df-2ebaf9ada3e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783e212f-3f9b-45c5-97df-2ebaf9ada3e8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-783e212f-3f9b-45c5-97df-2ebaf9ada3e8
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

{"items":[{"id":"led_21c4f58c-c95a-47f5-b865-ab573d60e2ae","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-27T08:00:35.065868429Z"},{"id":"led_e7637e9c-e188-409f-9aa8-d67a3b266756","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_fbc5445a-6ea3-43d9-8cbe-64dcf1a347de","createdAt":"2026-10-27T08:00:35.170534082Z"},{"id":"led_afdde616-7e58-4360-b3c7-532a54824278","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_cd07dff6-aa7a-4acb-a09c-6dfc49038d35","createdAt":"2026-10-27T08:00:35.204640628Z"},{"id":"led_61895ff4-2357-4c1a-b0c4-129549a990e3","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_0d944119-2220-482a-b178-006171f6f56a","createdAt":"2026-10-27T08:00:35.243891617Z"},{"id":"led_a30356de-4942-45fe-9709-58ee777eb100","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_0e774bd9-dbd5-4b68-a4ba-bebb1fac050d","createdAt":"2026-10-27T08:00:35.291360370Z"},{"id":"led_b0f65a89-dec9-4a45-8343-fa7fdab96e73","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_447c9163-88d7-4757-840d-6eb44f2a3655","createdAt":"2026-10-27T08:00:35.332497258Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-782d7b34-01c7-4572-a458-2bbf6462e6ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-782d7b34-01c7-4572-a458-2bbf6462e6ae
Content-Type: application/json

--- request body ---
{"handle":"qa-3551e22a57b1","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-782d7b34-01c7-4572-a458-2bbf6462e6ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eca09ae1-7826-459b-8d1a-9c70ee34646b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed6614c3-b93b-4095-b790-7e9ade3bdf37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed6614c3-b93b-4095-b790-7e9ade3bdf37
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed6614c3-b93b-4095-b790-7e9ade3bdf37
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
correlation: qa-db2c8b8d-0a56-4e82-a95a-9994a174b3d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db2c8b8d-0a56-4e82-a95a-9994a174b3d5
Content-Type: application/json

--- request body ---
{"handle":"qa-3551e22a57b1","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db2c8b8d-0a56-4e82-a95a-9994a174b3d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db2c8b8d-0a56-4e82-a95a-9994a174b3d5"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68009936-5290-442d-90fb-444d3b54981a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68009936-5290-442d-90fb-444d3b54981a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68009936-5290-442d-90fb-444d3b54981a
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
correlation: qa-18a7c6bc-bf5c-4271-b018-e035bdd3d15e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18a7c6bc-bf5c-4271-b018-e035bdd3d15e
Content-Type: application/json

--- request body ---
{"handle":"qa-7e2b8fe9a91a","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18a7c6bc-bf5c-4271-b018-e035bdd3d15e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18a7c6bc-bf5c-4271-b018-e035bdd3d15e"}
```
