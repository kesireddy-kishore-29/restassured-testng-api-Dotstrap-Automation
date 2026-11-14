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
| 1 | `POST /v1/accounts` | 201 | 320 | `qa-92169425-4756-490c-b7b7-8c774607fec7` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-195ae878-68af-4db7-9a93-449be9d2755b` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-776c9cb3-9695-4966-9f28-693e537d46dd` |
| 4 | `POST /v1/credits/purchases` | 201 | 50 | `qa-9f95185f-8a50-46e9-91bc-8324a7f3a3d5` |
| 5 | `POST /v1/credits/purchases` | 201 | 9 | `qa-47aaf9ed-eded-4a59-841b-9c89adde3255` |
| 6 | `POST /v1/conversations` | 201 | 10 | `qa-109775f9-b5d8-462e-8029-89d6ada14235` |
| 7 | `GET /v1/credits/ledger` | 200 | 20 | `qa-f375e7d9-df97-4c36-b2b1-f537f2d113a9` |
| 8 | `GET /v1/credits/balance` | 200 | 16 | `qa-12e88b27-1066-4819-8170-f9c749df080c` |
| 9 | `POST /v1/auth/token` | 200 | 11 | `qa-1a287553-956d-4e37-a11b-e99507197071` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-e1603b75-9fdb-45a3-882a-aa8ac4493c27` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-65758fd8-6a4a-49b5-95d4-b0b84299662b` |
| 12 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-73399faa-4718-48d9-a863-a9c2cf18e8bf` |
| 13 | `POST /v1/auth/token` | 401 | 9 | `qa-2b03e38c-83c0-4f99-b0fc-338e5857e942` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-92169425-4756-490c-b7b7-8c774607fec7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92169425-4756-490c-b7b7-8c774607fec7
Content-Type: application/json

--- request body ---
{"handle":"qa-84a8ae4597f3","displayName":"QA 84a8ae4597f3","password":"****","region":"eu"}

--- response: 201 in 320 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-92169425-4756-490c-b7b7-8c774607fec7
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
Location: /v1/accounts/qa-84a8ae4597f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f38f0494-5660-4034-8a8a-499e9c69076a","handle":"qa-84a8ae4597f3","displayName":"QA 84a8ae4597f3","region":"eu","role":"user","createdAt":"2026-11-10T09:59:33.412676860Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-195ae878-68af-4db7-9a93-449be9d2755b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-195ae878-68af-4db7-9a93-449be9d2755b
Content-Type: application/json

--- request body ---
{"handle":"qa-0e50292165ca","displayName":"QA 0e50292165ca","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-195ae878-68af-4db7-9a93-449be9d2755b
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
Location: /v1/accounts/qa-0e50292165ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39169960-9fe2-4362-b9b5-19ddaf665513","handle":"qa-0e50292165ca","displayName":"QA 0e50292165ca","region":"eu","role":"user","createdAt":"2026-11-10T09:59:33.696733008Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-776c9cb3-9695-4966-9f28-693e537d46dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776c9cb3-9695-4966-9f28-693e537d46dd
Content-Type: application/json

--- request body ---
{"handle":"qa-84a8ae4597f3","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-776c9cb3-9695-4966-9f28-693e537d46dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f38f0494-5660-4034-8a8a-499e9c69076a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9f95185f-8a50-46e9-91bc-8324a7f3a3d5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-14cc53dd43f34d908023a25c71ed492b
X-Correlation-Id: qa-9f95185f-8a50-46e9-91bc-8324a7f3a3d5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 50 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f95185f-8a50-46e9-91bc-8324a7f3a3d5
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
Location: /v1/credits/purchases/pur_56ec2a0d-bbe2-41da-91d6-ab8c5d08e87f
Content-Length: 144

{"id":"pur_56ec2a0d-bbe2-41da-91d6-ab8c5d08e87f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:33.826508241Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-47aaf9ed-eded-4a59-841b-9c89adde3255

--- request headers ---
Accept: application/json
Idempotency-Key: qa-05f962f0370b4edb951bf7ee2c028daa
X-Correlation-Id: qa-47aaf9ed-eded-4a59-841b-9c89adde3255
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-47aaf9ed-eded-4a59-841b-9c89adde3255
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
Location: /v1/credits/purchases/pur_94c1e2d2-a8a5-4a76-8f1a-456c2f3f98ea
Content-Length: 144

{"id":"pur_94c1e2d2-a8a5-4a76-8f1a-456c2f3f98ea","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-10T09:59:33.866269470Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-109775f9-b5d8-462e-8029-89d6ada14235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-109775f9-b5d8-462e-8029-89d6ada14235
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0e50292165ca","subject":"Paid message","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-109775f9-b5d8-462e-8029-89d6ada14235
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
Location: /v1/conversations/cnv_0885b011-2f07-4a6a-9a1e-66099bf506aa
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_0885b011-2f07-4a6a-9a1e-66099bf506aa","subject":"Paid message","status":"open","region":"eu","participants":["qa-84a8ae4597f3","qa-0e50292165ca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:33.886731137Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-f375e7d9-df97-4c36-b2b1-f537f2d113a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f375e7d9-df97-4c36-b2b1-f537f2d113a9
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f375e7d9-df97-4c36-b2b1-f537f2d113a9
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

{"items":[{"id":"led_448746a2-7672-4694-9f33-24f8c9b08b39","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-10T09:59:33.412697380Z"},{"id":"led_5f14eb30-6a1b-4a88-ae72-7ccd322d1eba","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_56ec2a0d-bbe2-41da-91d6-ab8c5d08e87f","createdAt":"2026-11-10T09:59:33.826508241Z"},{"id":"led_67d69697-f4e1-4c68-aba3-405e8bc27398","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_94c1e2d2-a8a5-4a76-8f1a-456c2f3f98ea","createdAt":"2026-11-10T09:59:33.866269470Z"},{"id":"led_6d253fbe-be8d-4917-a637-14d689c3bf55","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_0885b011-2f07-4a6a-9a1e-66099bf506aa","createdAt":"2026-11-10T09:59:33.886705558Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-12e88b27-1066-4819-8170-f9c749df080c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12e88b27-1066-4819-8170-f9c749df080c
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-12e88b27-1066-4819-8170-f9c749df080c
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

{"balance":64,"currency":"credits","accountId":"acc_f38f0494-5660-4034-8a8a-499e9c69076a"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-1a287553-956d-4e37-a11b-e99507197071

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a287553-956d-4e37-a11b-e99507197071
Content-Type: application/json

--- request body ---
{"handle":"qa-0e50292165ca","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a287553-956d-4e37-a11b-e99507197071
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39169960-9fe2-4362-b9b5-19ddaf665513"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1603b75-9fdb-45a3-882a-aa8ac4493c27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1603b75-9fdb-45a3-882a-aa8ac4493c27
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1603b75-9fdb-45a3-882a-aa8ac4493c27
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
correlation: qa-65758fd8-6a4a-49b5-95d4-b0b84299662b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65758fd8-6a4a-49b5-95d4-b0b84299662b
Content-Type: application/json

--- request body ---
{"handle":"qa-0e50292165ca","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65758fd8-6a4a-49b5-95d4-b0b84299662b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65758fd8-6a4a-49b5-95d4-b0b84299662b"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-73399faa-4718-48d9-a863-a9c2cf18e8bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73399faa-4718-48d9-a863-a9c2cf18e8bf
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-73399faa-4718-48d9-a863-a9c2cf18e8bf
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
correlation: qa-2b03e38c-83c0-4f99-b0fc-338e5857e942

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b03e38c-83c0-4f99-b0fc-338e5857e942
Content-Type: application/json

--- request body ---
{"handle":"qa-84a8ae4597f3","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b03e38c-83c0-4f99-b0fc-338e5857e942
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b03e38c-83c0-4f99-b0fc-338e5857e942"}
```
