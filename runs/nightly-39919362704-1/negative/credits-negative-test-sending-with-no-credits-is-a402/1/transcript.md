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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-443d6d18-654c-406b-924a-a3236a2e5c1a` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-a2ffbe08-3305-42a9-b997-3021f8ce095c` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-6d4940de-2636-483e-8e53-7313c718a823` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-f8b61fba-c3b5-4802-8190-67b5f30b4a43` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-591b1bd9-7cb9-4c50-8b3e-af7c7d2c6a82` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-ba3a51eb-f06a-4056-aef9-be924ac70385` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-caf5012a-b171-44a7-9dda-f3f76be1bf5c` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 15 | `qa-6ba51364-0a0a-4fbd-b65d-7b2fbe09e213` |
| 9 | `GET /v1/credits/balance` | 200 | 19 | `qa-da25ee85-b61e-49ec-aa15-86f1cb8e0188` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 8 | `qa-f9892c1f-2c6a-4f2b-8168-a483c3b71a35` |
| 11 | `GET /v1/credits/ledger` | 200 | 23 | `qa-699094e3-c598-4df4-830f-c95e58844e8c` |
| 12 | `POST /v1/auth/token` | 200 | 14 | `qa-e055e791-8d0f-4d45-a582-dbc86e542ae1` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-43ada8ab-253f-413e-b481-ffc05df9a421` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-e84a36ba-fb9f-412a-9caa-1568af82f617` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-208d0b95-d149-4cd1-ab37-bfc99b967dce` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-383496fc-4e3c-488c-950c-da2b4f357776` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-443d6d18-654c-406b-924a-a3236a2e5c1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443d6d18-654c-406b-924a-a3236a2e5c1a
Content-Type: application/json

--- request body ---
{"handle":"qa-20808908eb15","displayName":"QA 20808908eb15","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-443d6d18-654c-406b-924a-a3236a2e5c1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-20808908eb15
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e31d5d23-965b-46f7-b4e1-086ce521f751","handle":"qa-20808908eb15","displayName":"QA 20808908eb15","region":"eu","role":"user","createdAt":"2026-10-23T07:41:17.415547975Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a2ffbe08-3305-42a9-b997-3021f8ce095c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2ffbe08-3305-42a9-b997-3021f8ce095c
Content-Type: application/json

--- request body ---
{"handle":"qa-911d4f56219b","displayName":"QA 911d4f56219b","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2ffbe08-3305-42a9-b997-3021f8ce095c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-911d4f56219b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69d6bbad-b703-4e48-b884-36c91e773ebd","handle":"qa-911d4f56219b","displayName":"QA 911d4f56219b","region":"eu","role":"user","createdAt":"2026-10-23T07:41:17.464487459Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6d4940de-2636-483e-8e53-7313c718a823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d4940de-2636-483e-8e53-7313c718a823
Content-Type: application/json

--- request body ---
{"handle":"qa-20808908eb15","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d4940de-2636-483e-8e53-7313c718a823
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e31d5d23-965b-46f7-b4e1-086ce521f751"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f8b61fba-c3b5-4802-8190-67b5f30b4a43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8b61fba-c3b5-4802-8190-67b5f30b4a43
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-911d4f56219b","subject":"Many messages","message":"1"}

--- response: 201 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8b61fba-c3b5-4802-8190-67b5f30b4a43
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
Location: /v1/conversations/cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7","subject":"Many messages","status":"open","region":"eu","participants":["qa-20808908eb15","qa-911d4f56219b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:17.550460769Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7/messages
correlation: qa-591b1bd9-7cb9-4c50-8b3e-af7c7d2c6a82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-591b1bd9-7cb9-4c50-8b3e-af7c7d2c6a82
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-591b1bd9-7cb9-4c50-8b3e-af7c7d2c6a82
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

{"id":"msg_1afe3220-50d4-4945-a8c3-c4d5bbe27766","conversationId":"cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7","sender":"qa-20808908eb15","body":"2","createdAt":"2026-10-23T07:41:17.633657315Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7/messages
correlation: qa-ba3a51eb-f06a-4056-aef9-be924ac70385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba3a51eb-f06a-4056-aef9-be924ac70385
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba3a51eb-f06a-4056-aef9-be924ac70385
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

{"id":"msg_c5353cd5-3179-4bd6-971c-2a1510210349","conversationId":"cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7","sender":"qa-20808908eb15","body":"3","createdAt":"2026-10-23T07:41:17.678441617Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7/messages
correlation: qa-caf5012a-b171-44a7-9dda-f3f76be1bf5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caf5012a-b171-44a7-9dda-f3f76be1bf5c
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-caf5012a-b171-44a7-9dda-f3f76be1bf5c
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

{"id":"msg_35d95283-aabc-41d7-af58-088c33d134e2","conversationId":"cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7","sender":"qa-20808908eb15","body":"4","createdAt":"2026-10-23T07:41:17.721201461Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7/messages
correlation: qa-6ba51364-0a0a-4fbd-b65d-7b2fbe09e213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ba51364-0a0a-4fbd-b65d-7b2fbe09e213
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ba51364-0a0a-4fbd-b65d-7b2fbe09e213
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

{"id":"msg_bb204076-7a97-4c2e-a283-e51c7908b830","conversationId":"cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7","sender":"qa-20808908eb15","body":"5","createdAt":"2026-10-23T07:41:17.751684411Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-da25ee85-b61e-49ec-aa15-86f1cb8e0188

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da25ee85-b61e-49ec-aa15-86f1cb8e0188
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-da25ee85-b61e-49ec-aa15-86f1cb8e0188
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

{"balance":0,"currency":"credits","accountId":"acc_e31d5d23-965b-46f7-b4e1-086ce521f751"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7/messages
correlation: qa-f9892c1f-2c6a-4f2b-8168-a483c3b71a35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9892c1f-2c6a-4f2b-8168-a483c3b71a35
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9892c1f-2c6a-4f2b-8168-a483c3b71a35
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7/messages","correlationId":"qa-f9892c1f-2c6a-4f2b-8168-a483c3b71a35"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-699094e3-c598-4df4-830f-c95e58844e8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-699094e3-c598-4df4-830f-c95e58844e8c
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-699094e3-c598-4df4-830f-c95e58844e8c
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

{"items":[{"id":"led_784c66b3-bf6c-4a2a-a0d3-0a16488e7fcf","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-23T07:41:17.415562171Z"},{"id":"led_ca1c130d-e9b7-4ecb-bcbb-2b8bbd78ffa0","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_fcbac278-5ab8-4ada-89fb-d5b03ca607d7","createdAt":"2026-10-23T07:41:17.550264162Z"},{"id":"led_f3dc0f26-3174-41c1-906c-2135fbd26c23","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_1afe3220-50d4-4945-a8c3-c4d5bbe27766","createdAt":"2026-10-23T07:41:17.633618383Z"},{"id":"led_be4300c4-0d34-4513-9676-437275c361c5","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_c5353cd5-3179-4bd6-971c-2a1510210349","createdAt":"2026-10-23T07:41:17.678400180Z"},{"id":"led_eceb6bb7-e03b-4af1-9460-60dd226083ff","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_35d95283-aabc-41d7-af58-088c33d134e2","createdAt":"2026-10-23T07:41:17.721104400Z"},{"id":"led_8a633c1e-1910-488c-b287-c625a371819e","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_bb204076-7a97-4c2e-a283-e51c7908b830","createdAt":"2026-10-23T07:41:17.751645258Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e055e791-8d0f-4d45-a582-dbc86e542ae1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e055e791-8d0f-4d45-a582-dbc86e542ae1
Content-Type: application/json

--- request body ---
{"handle":"qa-911d4f56219b","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e055e791-8d0f-4d45-a582-dbc86e542ae1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69d6bbad-b703-4e48-b884-36c91e773ebd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43ada8ab-253f-413e-b481-ffc05df9a421

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ada8ab-253f-413e-b481-ffc05df9a421
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43ada8ab-253f-413e-b481-ffc05df9a421
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
correlation: qa-e84a36ba-fb9f-412a-9caa-1568af82f617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84a36ba-fb9f-412a-9caa-1568af82f617
Content-Type: application/json

--- request body ---
{"handle":"qa-911d4f56219b","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e84a36ba-fb9f-412a-9caa-1568af82f617
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e84a36ba-fb9f-412a-9caa-1568af82f617"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-208d0b95-d149-4cd1-ab37-bfc99b967dce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-208d0b95-d149-4cd1-ab37-bfc99b967dce
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-208d0b95-d149-4cd1-ab37-bfc99b967dce
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
correlation: qa-383496fc-4e3c-488c-950c-da2b4f357776

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-383496fc-4e3c-488c-950c-da2b4f357776
Content-Type: application/json

--- request body ---
{"handle":"qa-20808908eb15","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-383496fc-4e3c-488c-950c-da2b4f357776
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-383496fc-4e3c-488c-950c-da2b4f357776"}
```
