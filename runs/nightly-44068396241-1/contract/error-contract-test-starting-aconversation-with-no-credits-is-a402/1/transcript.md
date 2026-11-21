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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-c2d985ab-14b5-4bc3-949f-414b4cbf4f4a` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-96e8a4a9-cb1b-4e67-8af9-da893ccba68a` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-f8e070b8-f13d-4091-94cf-7f7f25ac5cc5` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-7de10673-2d6f-4973-96bf-85d4dbc8afe2` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 4 | `qa-27137a9c-3847-4701-b0ca-3fc6aeb28355` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-3bd56bb7-c97f-49c4-969c-48fe8337bc51` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 46 | `qa-a2a6c2e5-60c5-4f44-a80c-ee4bba48950e` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-8e2d7608-03aa-4a60-996a-97f83c175831` |
| 9 | `GET /v1/credits/balance` | 200 | 64 | `qa-b7043d09-107f-4de2-9e61-110f2c19be7b` |
| 10 | `POST /v1/conversations` | 402 | 15 | `qa-2a57b339-530b-4c7f-91f3-3dae55891740` |
| 11 | `GET /v1/credits/ledger` | 200 | 10 | `qa-6c941df8-f9d9-4031-8357-d6b53ef2187e` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-1d50c665-ecc1-4445-8b74-e2b0cf99a08c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-cc28a27d-1515-465f-aa0b-bd25a7d59cb1` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-95d6629c-f13c-45b2-8b09-c928b6eb96aa` |
| 15 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e003d981-8072-450e-905f-28e0b4de428f` |
| 16 | `POST /v1/auth/token` | 401 | 3 | `qa-3816e3f8-2f25-4eaa-813d-2e061a9c7abf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2d985ab-14b5-4bc3-949f-414b4cbf4f4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2d985ab-14b5-4bc3-949f-414b4cbf4f4a
Content-Type: application/json

--- request body ---
{"handle":"qa-4e92b9ebbcdc","displayName":"QA 4e92b9ebbcdc","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2d985ab-14b5-4bc3-949f-414b4cbf4f4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Location: /v1/accounts/qa-4e92b9ebbcdc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_70eecc65-3f89-4435-aef5-1e37c1f66f7f","handle":"qa-4e92b9ebbcdc","displayName":"QA 4e92b9ebbcdc","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.468783351Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-96e8a4a9-cb1b-4e67-8af9-da893ccba68a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96e8a4a9-cb1b-4e67-8af9-da893ccba68a
Content-Type: application/json

--- request body ---
{"handle":"qa-758de4d9cb93","displayName":"QA 758de4d9cb93","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-96e8a4a9-cb1b-4e67-8af9-da893ccba68a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Location: /v1/accounts/qa-758de4d9cb93
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31d41274-62bf-442d-88dd-68e625df08a1","handle":"qa-758de4d9cb93","displayName":"QA 758de4d9cb93","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.512594464Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f8e070b8-f13d-4091-94cf-7f7f25ac5cc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8e070b8-f13d-4091-94cf-7f7f25ac5cc5
Content-Type: application/json

--- request body ---
{"handle":"qa-4e92b9ebbcdc","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8e070b8-f13d-4091-94cf-7f7f25ac5cc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_70eecc65-3f89-4435-aef5-1e37c1f66f7f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7de10673-2d6f-4973-96bf-85d4dbc8afe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7de10673-2d6f-4973-96bf-85d4dbc8afe2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-758de4d9cb93","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-7de10673-2d6f-4973-96bf-85d4dbc8afe2
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
Location: /v1/conversations/cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0","subject":"Error contract","status":"open","region":"eu","participants":["qa-4e92b9ebbcdc","qa-758de4d9cb93"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.579118777Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0/messages
correlation: qa-27137a9c-3847-4701-b0ca-3fc6aeb28355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27137a9c-3847-4701-b0ca-3fc6aeb28355
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-27137a9c-3847-4701-b0ca-3fc6aeb28355
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

{"id":"msg_363774e4-433b-49d2-8c60-b99aef10747e","conversationId":"cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0","sender":"qa-4e92b9ebbcdc","body":"2","createdAt":"2026-11-17T10:50:19.590531444Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0/messages
correlation: qa-3bd56bb7-c97f-49c4-969c-48fe8337bc51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bd56bb7-c97f-49c4-969c-48fe8337bc51
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bd56bb7-c97f-49c4-969c-48fe8337bc51
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

{"id":"msg_43ede10d-5b2a-4a3f-8b76-30a5e2283f52","conversationId":"cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0","sender":"qa-4e92b9ebbcdc","body":"3","createdAt":"2026-11-17T10:50:19.605115657Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0/messages
correlation: qa-a2a6c2e5-60c5-4f44-a80c-ee4bba48950e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2a6c2e5-60c5-4f44-a80c-ee4bba48950e
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 46 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2a6c2e5-60c5-4f44-a80c-ee4bba48950e
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

{"id":"msg_ff224788-5a03-4ce8-b089-e668af540668","conversationId":"cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0","sender":"qa-4e92b9ebbcdc","body":"4","createdAt":"2026-11-17T10:50:19.659531716Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0/messages
correlation: qa-8e2d7608-03aa-4a60-996a-97f83c175831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e2d7608-03aa-4a60-996a-97f83c175831
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e2d7608-03aa-4a60-996a-97f83c175831
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

{"id":"msg_92667dcf-c96d-4fc0-ab36-7cd0c484f77c","conversationId":"cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0","sender":"qa-4e92b9ebbcdc","body":"5","createdAt":"2026-11-17T10:50:19.679287839Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-b7043d09-107f-4de2-9e61-110f2c19be7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7043d09-107f-4de2-9e61-110f2c19be7b
Content-Type: application/json

--- response: 200 in 64 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7043d09-107f-4de2-9e61-110f2c19be7b
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

{"balance":0,"currency":"credits","accountId":"acc_70eecc65-3f89-4435-aef5-1e37c1f66f7f"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-2a57b339-530b-4c7f-91f3-3dae55891740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a57b339-530b-4c7f-91f3-3dae55891740
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-758de4d9cb93","subject":"One more","message":"Hi"}

--- response: 402 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a57b339-530b-4c7f-91f3-3dae55891740
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-2a57b339-530b-4c7f-91f3-3dae55891740"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6c941df8-f9d9-4031-8357-d6b53ef2187e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c941df8-f9d9-4031-8357-d6b53ef2187e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c941df8-f9d9-4031-8357-d6b53ef2187e
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

{"items":[{"id":"led_12e3d50d-a3c0-43ab-a9d0-9b4c7a522bd6","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-17T10:50:19.468814686Z"},{"id":"led_bc1d7a26-4c93-4f7d-af69-d0fd980afe4a","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_e303ba58-20ce-42a5-a1e9-60b677e1bbf0","createdAt":"2026-11-17T10:50:19.579108874Z"},{"id":"led_9df4cdb6-0174-4456-9521-c91255b3828c","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_363774e4-433b-49d2-8c60-b99aef10747e","createdAt":"2026-11-17T10:50:19.590512561Z"},{"id":"led_40a92087-3cea-4052-a396-a8692e154846","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_43ede10d-5b2a-4a3f-8b76-30a5e2283f52","createdAt":"2026-11-17T10:50:19.605105040Z"},{"id":"led_afd4fed2-11da-4e3d-9c5f-5330465ffe29","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_ff224788-5a03-4ce8-b089-e668af540668","createdAt":"2026-11-17T10:50:19.659526255Z"},{"id":"led_c9ddf3a0-3ee0-42a4-9c4d-1b0d7c831652","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_92667dcf-c96d-4fc0-ab36-7cd0c484f77c","createdAt":"2026-11-17T10:50:19.679277631Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-1d50c665-ecc1-4445-8b74-e2b0cf99a08c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d50c665-ecc1-4445-8b74-e2b0cf99a08c
Content-Type: application/json

--- request body ---
{"handle":"qa-758de4d9cb93","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d50c665-ecc1-4445-8b74-e2b0cf99a08c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31d41274-62bf-442d-88dd-68e625df08a1"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc28a27d-1515-465f-aa0b-bd25a7d59cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc28a27d-1515-465f-aa0b-bd25a7d59cb1
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc28a27d-1515-465f-aa0b-bd25a7d59cb1
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
correlation: qa-95d6629c-f13c-45b2-8b09-c928b6eb96aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d6629c-f13c-45b2-8b09-c928b6eb96aa
Content-Type: application/json

--- request body ---
{"handle":"qa-758de4d9cb93","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95d6629c-f13c-45b2-8b09-c928b6eb96aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95d6629c-f13c-45b2-8b09-c928b6eb96aa"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e003d981-8072-450e-905f-28e0b4de428f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e003d981-8072-450e-905f-28e0b4de428f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e003d981-8072-450e-905f-28e0b4de428f
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
correlation: qa-3816e3f8-2f25-4eaa-813d-2e061a9c7abf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3816e3f8-2f25-4eaa-813d-2e061a9c7abf
Content-Type: application/json

--- request body ---
{"handle":"qa-4e92b9ebbcdc","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3816e3f8-2f25-4eaa-813d-2e061a9c7abf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3816e3f8-2f25-4eaa-813d-2e061a9c7abf"}
```
