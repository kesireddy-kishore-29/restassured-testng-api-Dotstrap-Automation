# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 474 | `qa-098e17c4-b8b2-4da4-87cc-884f87ef78dc` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-a0b82c5b-a863-4e25-bda1-280217b073d2` |
| 3 | `POST /v1/auth/token` | 200 | 81 | `qa-dcbc984a-aef5-425d-be4d-bfb21f8b71fc` |
| 4 | `POST /v1/credits/purchases` | 201 | 75 | `qa-7d0472e2-715d-430f-b80b-47519158d056` |
| 5 | `POST /v1/credits/purchases` | 201 | 16 | `qa-18d446a2-6302-4c76-b980-fead071762fa` |
| 6 | `POST /v1/conversations` | 201 | 8 | `qa-5fda7462-4eda-4439-bed3-424ba6b1c11d` |
| 7 | `GET /v1/credits/ledger` | 200 | 44 | `qa-bf6c943f-153a-440c-810d-fc407d8fef63` |
| 8 | `GET /v1/credits/balance` | 200 | 20 | `qa-ebf53490-144b-45ed-9bb1-7d1bbdfc8356` |
| 9 | `POST /v1/auth/token` | 200 | 16 | `qa-4ac1c39d-08e9-445f-8e45-6470adb12447` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ccea7750-3fbd-433e-8f4a-4ed754388719` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-829e5868-6e27-4d24-8373-212a56da09e6` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-35f4966a-4a9a-4315-9508-6b0cb0b1977b` |
| 13 | `POST /v1/auth/token` | 401 | 6 | `qa-0c9998c2-9d1f-4882-a259-c56fcbf8228b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-098e17c4-b8b2-4da4-87cc-884f87ef78dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-098e17c4-b8b2-4da4-87cc-884f87ef78dc
Content-Type: application/json

--- request body ---
{"handle":"qa-c5e8b2b20629","displayName":"QA c5e8b2b20629","password":"****","region":"eu"}

--- response: 201 in 474 ms ---
Date: Sat, 24 Oct 2026 07:25:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-098e17c4-b8b2-4da4-87cc-884f87ef78dc
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
Location: /v1/accounts/qa-c5e8b2b20629
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ec1c20e3-e372-4a7c-a5dd-817537d5d431","handle":"qa-c5e8b2b20629","displayName":"QA c5e8b2b20629","region":"eu","role":"user","createdAt":"2026-10-24T07:25:34.808389258Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a0b82c5b-a863-4e25-bda1-280217b073d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0b82c5b-a863-4e25-bda1-280217b073d2
Content-Type: application/json

--- request body ---
{"handle":"qa-d8cd32679737","displayName":"QA d8cd32679737","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0b82c5b-a863-4e25-bda1-280217b073d2
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
Location: /v1/accounts/qa-d8cd32679737
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2700ceac-4bec-4e05-9475-171a16fd42bf","handle":"qa-d8cd32679737","displayName":"QA d8cd32679737","region":"eu","role":"user","createdAt":"2026-10-24T07:25:35.355868038Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dcbc984a-aef5-425d-be4d-bfb21f8b71fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcbc984a-aef5-425d-be4d-bfb21f8b71fc
Content-Type: application/json

--- request body ---
{"handle":"qa-c5e8b2b20629","password":"****"}

--- response: 200 in 81 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcbc984a-aef5-425d-be4d-bfb21f8b71fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ec1c20e3-e372-4a7c-a5dd-817537d5d431"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7d0472e2-715d-430f-b80b-47519158d056

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4057c8a9421d435681822b81f370ef85
X-Correlation-Id: qa-7d0472e2-715d-430f-b80b-47519158d056
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 75 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d0472e2-715d-430f-b80b-47519158d056
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
Location: /v1/credits/purchases/pur_1b674794-a1f8-4df4-a9fd-29ed55915ae2
Content-Length: 144

{"id":"pur_1b674794-a1f8-4df4-a9fd-29ed55915ae2","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-24T07:25:35.653933343Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-18d446a2-6302-4c76-b980-fead071762fa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0e03530edac9495f9fb928e6224eab22
X-Correlation-Id: qa-18d446a2-6302-4c76-b980-fead071762fa
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-18d446a2-6302-4c76-b980-fead071762fa
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
Location: /v1/credits/purchases/pur_0118eeca-b460-4749-9d8e-6f341fe70660
Content-Length: 144

{"id":"pur_0118eeca-b460-4749-9d8e-6f341fe70660","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-24T07:25:35.702617491Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-5fda7462-4eda-4439-bed3-424ba6b1c11d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fda7462-4eda-4439-bed3-424ba6b1c11d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d8cd32679737","subject":"Paid message","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fda7462-4eda-4439-bed3-424ba6b1c11d
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
Location: /v1/conversations/cnv_c5bac0fe-f61b-4c77-a074-37575caa8899
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_c5bac0fe-f61b-4c77-a074-37575caa8899","subject":"Paid message","status":"open","region":"eu","participants":["qa-c5e8b2b20629","qa-d8cd32679737"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:35.727594692Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-bf6c943f-153a-440c-810d-fc407d8fef63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf6c943f-153a-440c-810d-fc407d8fef63
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf6c943f-153a-440c-810d-fc407d8fef63
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
Content-Length: 791

{"items":[{"id":"led_3340f5aa-fcdf-4174-8250-e294718657e9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-24T07:25:34.808402422Z"},{"id":"led_9a413d96-123c-4c62-87d3-ec530ebceb76","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_1b674794-a1f8-4df4-a9fd-29ed55915ae2","createdAt":"2026-10-24T07:25:35.653933343Z"},{"id":"led_05832934-5327-499e-9ad4-a88c4c86f238","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_0118eeca-b460-4749-9d8e-6f341fe70660","createdAt":"2026-10-24T07:25:35.702617491Z"},{"id":"led_acaf98ff-ef1a-46cf-a807-8b0411501775","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_c5bac0fe-f61b-4c77-a074-37575caa8899","createdAt":"2026-10-24T07:25:35.727555018Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-ebf53490-144b-45ed-9bb1-7d1bbdfc8356

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebf53490-144b-45ed-9bb1-7d1bbdfc8356
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebf53490-144b-45ed-9bb1-7d1bbdfc8356
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
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_ec1c20e3-e372-4a7c-a5dd-817537d5d431"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4ac1c39d-08e9-445f-8e45-6470adb12447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ac1c39d-08e9-445f-8e45-6470adb12447
Content-Type: application/json

--- request body ---
{"handle":"qa-d8cd32679737","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ac1c39d-08e9-445f-8e45-6470adb12447
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2700ceac-4bec-4e05-9475-171a16fd42bf"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ccea7750-3fbd-433e-8f4a-4ed754388719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccea7750-3fbd-433e-8f4a-4ed754388719
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ccea7750-3fbd-433e-8f4a-4ed754388719
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-829e5868-6e27-4d24-8373-212a56da09e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-829e5868-6e27-4d24-8373-212a56da09e6
Content-Type: application/json

--- request body ---
{"handle":"qa-d8cd32679737","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-829e5868-6e27-4d24-8373-212a56da09e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-829e5868-6e27-4d24-8373-212a56da09e6"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35f4966a-4a9a-4315-9508-6b0cb0b1977b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35f4966a-4a9a-4315-9508-6b0cb0b1977b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35f4966a-4a9a-4315-9508-6b0cb0b1977b
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-0c9998c2-9d1f-4882-a259-c56fcbf8228b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c9998c2-9d1f-4882-a259-c56fcbf8228b
Content-Type: application/json

--- request body ---
{"handle":"qa-c5e8b2b20629","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c9998c2-9d1f-4882-a259-c56fcbf8228b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c9998c2-9d1f-4882-a259-c56fcbf8228b"}
```
