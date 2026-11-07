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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-a1c0643e-039f-4fb1-b478-f1813193d11b` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-561be978-fe66-453e-b9a4-8c71a3d3fd9d` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-6b4d6e29-3e16-40eb-a2f6-cadabaa28b80` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-6dfdd7cf-b8cd-4922-b3a6-41604ed679a1` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-fef08437-fa56-4c15-a713-0aaa4e3aba40` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-e5e80ecc-947d-4ffa-beaa-6722526b369a` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 28 | `qa-1a3da648-b8eb-4f8a-92cc-aa59f3073cd2` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-e57713cf-d141-42f1-a8e2-9776d86c84ad` |
| 9 | `GET /v1/credits/balance` | 200 | 9 | `qa-2fe758de-c7cd-4b04-8f43-72f025b7acaf` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 16 | `qa-336c4236-d747-46fb-a122-eb05f51e87e6` |
| 11 | `GET /v1/credits/ledger` | 200 | 25 | `qa-37c80ec7-47dd-429f-ade2-3513b98c370c` |
| 12 | `POST /v1/auth/token` | 200 | 15 | `qa-9af8bb28-a0e8-48d6-9765-35783a1888b3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f35ee717-049c-443b-97e5-4a61386e37ab` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-699be57d-62ef-4135-8799-2e60ff0c3375` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-6387e89a-83a4-4765-9ae6-e0c066f0e26c` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-7a458abb-db2c-490a-8920-d6ba89e3298c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a1c0643e-039f-4fb1-b478-f1813193d11b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c0643e-039f-4fb1-b478-f1813193d11b
Content-Type: application/json

--- request body ---
{"handle":"qa-287c5e384d5d","displayName":"QA 287c5e384d5d","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1c0643e-039f-4fb1-b478-f1813193d11b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-287c5e384d5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eedafb04-79c5-4e17-b19f-f3a6d3553099","handle":"qa-287c5e384d5d","displayName":"QA 287c5e384d5d","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.065612724Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-561be978-fe66-453e-b9a4-8c71a3d3fd9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-561be978-fe66-453e-b9a4-8c71a3d3fd9d
Content-Type: application/json

--- request body ---
{"handle":"qa-4bfa252ad2c4","displayName":"QA 4bfa252ad2c4","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-561be978-fe66-453e-b9a4-8c71a3d3fd9d
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
Location: /v1/accounts/qa-4bfa252ad2c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d3c34a2-74d2-47c5-a40d-9d199493b4aa","handle":"qa-4bfa252ad2c4","displayName":"QA 4bfa252ad2c4","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.125554384Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6b4d6e29-3e16-40eb-a2f6-cadabaa28b80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b4d6e29-3e16-40eb-a2f6-cadabaa28b80
Content-Type: application/json

--- request body ---
{"handle":"qa-287c5e384d5d","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b4d6e29-3e16-40eb-a2f6-cadabaa28b80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eedafb04-79c5-4e17-b19f-f3a6d3553099"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6dfdd7cf-b8cd-4922-b3a6-41604ed679a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dfdd7cf-b8cd-4922-b3a6-41604ed679a1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4bfa252ad2c4","subject":"Many messages","message":"1"}

--- response: 201 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dfdd7cf-b8cd-4922-b3a6-41604ed679a1
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
Location: /v1/conversations/cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d","subject":"Many messages","status":"open","region":"eu","participants":["qa-287c5e384d5d","qa-4bfa252ad2c4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:15.175612945Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d/messages
correlation: qa-fef08437-fa56-4c15-a713-0aaa4e3aba40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fef08437-fa56-4c15-a713-0aaa4e3aba40
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fef08437-fa56-4c15-a713-0aaa4e3aba40
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

{"id":"msg_9c055af6-e151-4805-a6ae-c0844d263587","conversationId":"cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d","sender":"qa-287c5e384d5d","body":"2","createdAt":"2026-11-04T09:28:15.212849348Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d/messages
correlation: qa-e5e80ecc-947d-4ffa-beaa-6722526b369a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e80ecc-947d-4ffa-beaa-6722526b369a
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5e80ecc-947d-4ffa-beaa-6722526b369a
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

{"id":"msg_2f68b8b6-e282-4a04-846a-dc1d98e6e26f","conversationId":"cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d","sender":"qa-287c5e384d5d","body":"3","createdAt":"2026-11-04T09:28:15.254715261Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d/messages
correlation: qa-1a3da648-b8eb-4f8a-92cc-aa59f3073cd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a3da648-b8eb-4f8a-92cc-aa59f3073cd2
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a3da648-b8eb-4f8a-92cc-aa59f3073cd2
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

{"id":"msg_58805561-5cb0-48f8-94ab-f39a18c3ff7f","conversationId":"cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d","sender":"qa-287c5e384d5d","body":"4","createdAt":"2026-11-04T09:28:15.296183559Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d/messages
correlation: qa-e57713cf-d141-42f1-a8e2-9776d86c84ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e57713cf-d141-42f1-a8e2-9776d86c84ad
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e57713cf-d141-42f1-a8e2-9776d86c84ad
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

{"id":"msg_fdc48df9-da7c-4fd9-9b5a-295aeb91efbb","conversationId":"cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d","sender":"qa-287c5e384d5d","body":"5","createdAt":"2026-11-04T09:28:15.330576268Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-2fe758de-c7cd-4b04-8f43-72f025b7acaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fe758de-c7cd-4b04-8f43-72f025b7acaf
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fe758de-c7cd-4b04-8f43-72f025b7acaf
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

{"balance":0,"currency":"credits","accountId":"acc_eedafb04-79c5-4e17-b19f-f3a6d3553099"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d/messages
correlation: qa-336c4236-d747-46fb-a122-eb05f51e87e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-336c4236-d747-46fb-a122-eb05f51e87e6
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-336c4236-d747-46fb-a122-eb05f51e87e6
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d/messages","correlationId":"qa-336c4236-d747-46fb-a122-eb05f51e87e6"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-37c80ec7-47dd-429f-ade2-3513b98c370c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37c80ec7-47dd-429f-ade2-3513b98c370c
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-37c80ec7-47dd-429f-ade2-3513b98c370c
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

{"items":[{"id":"led_33b5ef0b-9fe4-47f3-b6fb-213dea8f5989","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-04T09:28:15.065627712Z"},{"id":"led_31a13407-36a9-4498-bba7-5d981542bec7","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_6d118cf6-4533-440f-b735-cbf5e8c19d8d","createdAt":"2026-11-04T09:28:15.175575094Z"},{"id":"led_4e60f431-87af-4d0f-96c9-5adafde65105","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_9c055af6-e151-4805-a6ae-c0844d263587","createdAt":"2026-11-04T09:28:15.212829832Z"},{"id":"led_2fb6009b-fedb-4842-944d-c07cd59f67da","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_2f68b8b6-e282-4a04-846a-dc1d98e6e26f","createdAt":"2026-11-04T09:28:15.254681006Z"},{"id":"led_5fc7c389-83d4-4da9-a0fd-d7ccbc3a6ebb","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_58805561-5cb0-48f8-94ab-f39a18c3ff7f","createdAt":"2026-11-04T09:28:15.296144055Z"},{"id":"led_30a0e2ce-7f97-4d8b-a896-f27300a29659","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_fdc48df9-da7c-4fd9-9b5a-295aeb91efbb","createdAt":"2026-11-04T09:28:15.330523809Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-9af8bb28-a0e8-48d6-9765-35783a1888b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9af8bb28-a0e8-48d6-9765-35783a1888b3
Content-Type: application/json

--- request body ---
{"handle":"qa-4bfa252ad2c4","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9af8bb28-a0e8-48d6-9765-35783a1888b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d3c34a2-74d2-47c5-a40d-9d199493b4aa"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f35ee717-049c-443b-97e5-4a61386e37ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f35ee717-049c-443b-97e5-4a61386e37ab
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f35ee717-049c-443b-97e5-4a61386e37ab
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
correlation: qa-699be57d-62ef-4135-8799-2e60ff0c3375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-699be57d-62ef-4135-8799-2e60ff0c3375
Content-Type: application/json

--- request body ---
{"handle":"qa-4bfa252ad2c4","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-699be57d-62ef-4135-8799-2e60ff0c3375
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-699be57d-62ef-4135-8799-2e60ff0c3375"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6387e89a-83a4-4765-9ae6-e0c066f0e26c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6387e89a-83a4-4765-9ae6-e0c066f0e26c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6387e89a-83a4-4765-9ae6-e0c066f0e26c
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
correlation: qa-7a458abb-db2c-490a-8920-d6ba89e3298c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a458abb-db2c-490a-8920-d6ba89e3298c
Content-Type: application/json

--- request body ---
{"handle":"qa-287c5e384d5d","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a458abb-db2c-490a-8920-d6ba89e3298c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a458abb-db2c-490a-8920-d6ba89e3298c"}
```
