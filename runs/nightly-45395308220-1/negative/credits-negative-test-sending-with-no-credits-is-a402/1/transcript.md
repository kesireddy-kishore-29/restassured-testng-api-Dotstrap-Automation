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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-5273cb7a-eafa-4e84-a5bd-582a3b5f2121` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-6f1ea8e0-c378-4171-bc79-5ee15897927f` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-9683f0ff-4266-44d5-a3a7-be40ba492095` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-796a0e82-b7ed-416e-a78f-c9c8c4e810b7` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-81432faa-1f37-4bd7-b0a9-19e79075df71` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-ce07591c-cae4-4ac4-b964-1a01c6cbf5ca` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-88a98f8d-6082-4a75-a1c6-b275fba0a6bd` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-12438df1-8b4f-43a9-ad7c-aa16751410ee` |
| 9 | `GET /v1/credits/balance` | 200 | 9 | `qa-a4e46e81-9863-4bd4-821e-bcb062b00114` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 9 | `qa-4a562bd0-0f02-42f8-bcd0-de4ff63facd5` |
| 11 | `GET /v1/credits/ledger` | 200 | 12 | `qa-fdbbcee4-1e6e-4443-9015-397d79dc5b55` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-6d3dcb4c-eeeb-4e9a-a195-13c8307c492f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-72246717-e8fc-4382-b766-958a51b54599` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-c90712c6-427e-4805-8f47-ad8bea9f7470` |
| 15 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ca9bba08-296b-441d-930a-720c30aab567` |
| 16 | `POST /v1/auth/token` | 401 | 10 | `qa-71f891db-8284-4381-89d7-54e4634af35b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5273cb7a-eafa-4e84-a5bd-582a3b5f2121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5273cb7a-eafa-4e84-a5bd-582a3b5f2121
Content-Type: application/json

--- request body ---
{"handle":"qa-ad26f7e9622b","displayName":"QA ad26f7e9622b","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5273cb7a-eafa-4e84-a5bd-582a3b5f2121
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
Location: /v1/accounts/qa-ad26f7e9622b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_334c9aff-2b5f-43be-bd71-418734a95561","handle":"qa-ad26f7e9622b","displayName":"QA ad26f7e9622b","region":"eu","role":"user","createdAt":"2026-11-24T12:38:00.678818430Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6f1ea8e0-c378-4171-bc79-5ee15897927f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f1ea8e0-c378-4171-bc79-5ee15897927f
Content-Type: application/json

--- request body ---
{"handle":"qa-44a68cdab434","displayName":"QA 44a68cdab434","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f1ea8e0-c378-4171-bc79-5ee15897927f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-44a68cdab434
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6cb54c34-634f-48fd-b439-85b02598a622","handle":"qa-44a68cdab434","displayName":"QA 44a68cdab434","region":"eu","role":"user","createdAt":"2026-11-24T12:38:00.698370594Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9683f0ff-4266-44d5-a3a7-be40ba492095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9683f0ff-4266-44d5-a3a7-be40ba492095
Content-Type: application/json

--- request body ---
{"handle":"qa-ad26f7e9622b","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9683f0ff-4266-44d5-a3a7-be40ba492095
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_334c9aff-2b5f-43be-bd71-418734a95561"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-796a0e82-b7ed-416e-a78f-c9c8c4e810b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-796a0e82-b7ed-416e-a78f-c9c8c4e810b7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-44a68cdab434","subject":"Many messages","message":"1"}

--- response: 201 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-796a0e82-b7ed-416e-a78f-c9c8c4e810b7
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
Location: /v1/conversations/cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a","subject":"Many messages","status":"open","region":"eu","participants":["qa-ad26f7e9622b","qa-44a68cdab434"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:00.741909449Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a/messages
correlation: qa-81432faa-1f37-4bd7-b0a9-19e79075df71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81432faa-1f37-4bd7-b0a9-19e79075df71
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-81432faa-1f37-4bd7-b0a9-19e79075df71
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

{"id":"msg_f17f24f9-eebf-4650-a45b-89928276e2ad","conversationId":"cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a","sender":"qa-ad26f7e9622b","body":"2","createdAt":"2026-11-24T12:38:00.765367379Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a/messages
correlation: qa-ce07591c-cae4-4ac4-b964-1a01c6cbf5ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce07591c-cae4-4ac4-b964-1a01c6cbf5ca
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce07591c-cae4-4ac4-b964-1a01c6cbf5ca
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

{"id":"msg_1223437a-3aa8-4f8e-a42c-39295c587f5b","conversationId":"cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a","sender":"qa-ad26f7e9622b","body":"3","createdAt":"2026-11-24T12:38:00.795749836Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a/messages
correlation: qa-88a98f8d-6082-4a75-a1c6-b275fba0a6bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88a98f8d-6082-4a75-a1c6-b275fba0a6bd
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-88a98f8d-6082-4a75-a1c6-b275fba0a6bd
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

{"id":"msg_d3fa7f62-4b7d-447a-ac00-8165cb9946ca","conversationId":"cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a","sender":"qa-ad26f7e9622b","body":"4","createdAt":"2026-11-24T12:38:00.817370572Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a/messages
correlation: qa-12438df1-8b4f-43a9-ad7c-aa16751410ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12438df1-8b4f-43a9-ad7c-aa16751410ee
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-12438df1-8b4f-43a9-ad7c-aa16751410ee
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

{"id":"msg_354b8e75-43f2-46bf-bf1e-fe7097fa545c","conversationId":"cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a","sender":"qa-ad26f7e9622b","body":"5","createdAt":"2026-11-24T12:38:00.828460596Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-a4e46e81-9863-4bd4-821e-bcb062b00114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4e46e81-9863-4bd4-821e-bcb062b00114
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4e46e81-9863-4bd4-821e-bcb062b00114
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

{"balance":0,"currency":"credits","accountId":"acc_334c9aff-2b5f-43be-bd71-418734a95561"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a/messages
correlation: qa-4a562bd0-0f02-42f8-bcd0-de4ff63facd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a562bd0-0f02-42f8-bcd0-de4ff63facd5
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a562bd0-0f02-42f8-bcd0-de4ff63facd5
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a/messages","correlationId":"qa-4a562bd0-0f02-42f8-bcd0-de4ff63facd5"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-fdbbcee4-1e6e-4443-9015-397d79dc5b55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdbbcee4-1e6e-4443-9015-397d79dc5b55
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdbbcee4-1e6e-4443-9015-397d79dc5b55
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

{"items":[{"id":"led_d3f8631e-5a0b-4fc3-86ab-3b3fe02a0258","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-24T12:38:00.678831630Z"},{"id":"led_131c718e-b54a-46e2-a494-77483232334c","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_e1838e72-a3c2-43a8-bdb7-f42828a25a5a","createdAt":"2026-11-24T12:38:00.741886886Z"},{"id":"led_784a8185-0a95-49b4-a194-5d954169c786","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_f17f24f9-eebf-4650-a45b-89928276e2ad","createdAt":"2026-11-24T12:38:00.765320139Z"},{"id":"led_f5b543ae-19d7-4ff5-b577-de43fad07b0c","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_1223437a-3aa8-4f8e-a42c-39295c587f5b","createdAt":"2026-11-24T12:38:00.795728274Z"},{"id":"led_946bd08a-dee3-4151-be19-c1e6f5da14f1","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_d3fa7f62-4b7d-447a-ac00-8165cb9946ca","createdAt":"2026-11-24T12:38:00.817325405Z"},{"id":"led_fbb78843-a684-4a10-ab5b-a7ce5ae82eb9","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_354b8e75-43f2-46bf-bf1e-fe7097fa545c","createdAt":"2026-11-24T12:38:00.828435929Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-6d3dcb4c-eeeb-4e9a-a195-13c8307c492f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d3dcb4c-eeeb-4e9a-a195-13c8307c492f
Content-Type: application/json

--- request body ---
{"handle":"qa-44a68cdab434","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d3dcb4c-eeeb-4e9a-a195-13c8307c492f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6cb54c34-634f-48fd-b439-85b02598a622"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72246717-e8fc-4382-b766-958a51b54599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72246717-e8fc-4382-b766-958a51b54599
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72246717-e8fc-4382-b766-958a51b54599
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
correlation: qa-c90712c6-427e-4805-8f47-ad8bea9f7470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c90712c6-427e-4805-8f47-ad8bea9f7470
Content-Type: application/json

--- request body ---
{"handle":"qa-44a68cdab434","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c90712c6-427e-4805-8f47-ad8bea9f7470
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c90712c6-427e-4805-8f47-ad8bea9f7470"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca9bba08-296b-441d-930a-720c30aab567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca9bba08-296b-441d-930a-720c30aab567
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca9bba08-296b-441d-930a-720c30aab567
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
correlation: qa-71f891db-8284-4381-89d7-54e4634af35b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f891db-8284-4381-89d7-54e4634af35b
Content-Type: application/json

--- request body ---
{"handle":"qa-ad26f7e9622b","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71f891db-8284-4381-89d7-54e4634af35b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71f891db-8284-4381-89d7-54e4634af35b"}
```
