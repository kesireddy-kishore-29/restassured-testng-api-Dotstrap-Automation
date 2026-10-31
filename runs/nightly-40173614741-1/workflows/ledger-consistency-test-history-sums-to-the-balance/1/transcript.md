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
| 1 | `POST /v1/accounts` | 201 | 491 | `qa-8797bf6d-7786-456f-b30f-05fd06211fcc` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-fc8fff43-b176-4b5e-9daa-b0e84ef6eea4` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-bef859e6-251d-4fde-8d9f-b3b80fa74a44` |
| 4 | `POST /v1/credits/purchases` | 201 | 78 | `qa-93c0221c-a799-4ba1-b224-865df87e0565` |
| 5 | `POST /v1/credits/purchases` | 201 | 18 | `qa-fc1a3fbd-5192-4781-97be-700a5da70dfc` |
| 6 | `POST /v1/conversations` | 201 | 22 | `qa-d5e27fdc-6366-4c5d-929d-c699e9663416` |
| 7 | `GET /v1/credits/ledger` | 200 | 26 | `qa-48fd155b-f7fb-4ae3-b2e7-afb7678ab01b` |
| 8 | `GET /v1/credits/balance` | 200 | 23 | `qa-8252f338-e3cc-4829-a45f-7717ad94fe91` |
| 9 | `POST /v1/auth/token` | 200 | 38 | `qa-58d6cfe8-df52-461e-bc04-81addc6bd3b7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-323cfa7d-5e7e-4ff3-bd34-deb0bba3b36b` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-ba6e9119-a258-4354-a0d5-ab557078d706` |
| 12 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-4997b9db-cb99-4e0c-ac13-bf58fe499117` |
| 13 | `POST /v1/auth/token` | 401 | 13 | `qa-07a25348-2d3e-4ab7-a449-d4be22a28848` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8797bf6d-7786-456f-b30f-05fd06211fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8797bf6d-7786-456f-b30f-05fd06211fcc
Content-Type: application/json

--- request body ---
{"handle":"qa-618ff400febe","displayName":"QA 618ff400febe","password":"****","region":"eu"}

--- response: 201 in 491 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8797bf6d-7786-456f-b30f-05fd06211fcc
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
Location: /v1/accounts/qa-618ff400febe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df7fd355-456f-4f44-8d12-2a5823c5f9aa","handle":"qa-618ff400febe","displayName":"QA 618ff400febe","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.372244963Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fc8fff43-b176-4b5e-9daa-b0e84ef6eea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc8fff43-b176-4b5e-9daa-b0e84ef6eea4
Content-Type: application/json

--- request body ---
{"handle":"qa-e883decbefab","displayName":"QA e883decbefab","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc8fff43-b176-4b5e-9daa-b0e84ef6eea4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-e883decbefab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a5e823bf-56a8-4855-bbef-de1330b9fc35","handle":"qa-e883decbefab","displayName":"QA e883decbefab","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.963604071Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bef859e6-251d-4fde-8d9f-b3b80fa74a44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bef859e6-251d-4fde-8d9f-b3b80fa74a44
Content-Type: application/json

--- request body ---
{"handle":"qa-618ff400febe","password":"****"}

--- response: 200 in 40 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-bef859e6-251d-4fde-8d9f-b3b80fa74a44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df7fd355-456f-4f44-8d12-2a5823c5f9aa"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-93c0221c-a799-4ba1-b224-865df87e0565

--- request headers ---
Accept: application/json
Idempotency-Key: qa-23bf60ede48f41feaa96aac2ce343773
X-Correlation-Id: qa-93c0221c-a799-4ba1-b224-865df87e0565
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 78 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-93c0221c-a799-4ba1-b224-865df87e0565
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
Location: /v1/credits/purchases/pur_ecbf5889-1acb-40c2-939d-2c132cf74505
Content-Length: 144

{"id":"pur_ecbf5889-1acb-40c2-939d-2c132cf74505","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-25T07:40:26.226862049Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fc1a3fbd-5192-4781-97be-700a5da70dfc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b5d6b2d2f96447078ad7574c9a9ab7dd
X-Correlation-Id: qa-fc1a3fbd-5192-4781-97be-700a5da70dfc
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc1a3fbd-5192-4781-97be-700a5da70dfc
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
Location: /v1/credits/purchases/pur_9484d092-1b9d-488c-b5cc-c7f07feeee18
Content-Length: 144

{"id":"pur_9484d092-1b9d-488c-b5cc-c7f07feeee18","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-25T07:40:26.272544995Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-d5e27fdc-6366-4c5d-929d-c699e9663416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5e27fdc-6366-4c5d-929d-c699e9663416
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e883decbefab","subject":"Paid message","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5e27fdc-6366-4c5d-929d-c699e9663416
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
Location: /v1/conversations/cnv_ef54a3d5-0418-4c85-994f-dd6f0e9ce270
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_ef54a3d5-0418-4c85-994f-dd6f0e9ce270","subject":"Paid message","status":"open","region":"eu","participants":["qa-618ff400febe","qa-e883decbefab"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.319019902Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-48fd155b-f7fb-4ae3-b2e7-afb7678ab01b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48fd155b-f7fb-4ae3-b2e7-afb7678ab01b
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-48fd155b-f7fb-4ae3-b2e7-afb7678ab01b
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

{"items":[{"id":"led_c7ca3488-5843-44da-b460-e9f3f14a8900","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-25T07:40:25.372265282Z"},{"id":"led_cadde447-960b-42b2-a443-1138dcd37bb1","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_ecbf5889-1acb-40c2-939d-2c132cf74505","createdAt":"2026-10-25T07:40:26.226862049Z"},{"id":"led_6ebbec2a-13bd-4382-a5a0-b0b4a644a3a3","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_9484d092-1b9d-488c-b5cc-c7f07feeee18","createdAt":"2026-10-25T07:40:26.272544995Z"},{"id":"led_143f8574-ef32-4c30-b551-2709e52cba94","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_ef54a3d5-0418-4c85-994f-dd6f0e9ce270","createdAt":"2026-10-25T07:40:26.318979896Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-8252f338-e3cc-4829-a45f-7717ad94fe91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8252f338-e3cc-4829-a45f-7717ad94fe91
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8252f338-e3cc-4829-a45f-7717ad94fe91
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

{"balance":64,"currency":"credits","accountId":"acc_df7fd355-456f-4f44-8d12-2a5823c5f9aa"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-58d6cfe8-df52-461e-bc04-81addc6bd3b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58d6cfe8-df52-461e-bc04-81addc6bd3b7
Content-Type: application/json

--- request body ---
{"handle":"qa-e883decbefab","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-58d6cfe8-df52-461e-bc04-81addc6bd3b7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a5e823bf-56a8-4855-bbef-de1330b9fc35"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-323cfa7d-5e7e-4ff3-bd34-deb0bba3b36b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-323cfa7d-5e7e-4ff3-bd34-deb0bba3b36b
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-323cfa7d-5e7e-4ff3-bd34-deb0bba3b36b
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
correlation: qa-ba6e9119-a258-4354-a0d5-ab557078d706

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba6e9119-a258-4354-a0d5-ab557078d706
Content-Type: application/json

--- request body ---
{"handle":"qa-e883decbefab","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba6e9119-a258-4354-a0d5-ab557078d706
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba6e9119-a258-4354-a0d5-ab557078d706"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4997b9db-cb99-4e0c-ac13-bf58fe499117

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4997b9db-cb99-4e0c-ac13-bf58fe499117
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4997b9db-cb99-4e0c-ac13-bf58fe499117
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
correlation: qa-07a25348-2d3e-4ab7-a449-d4be22a28848

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07a25348-2d3e-4ab7-a449-d4be22a28848
Content-Type: application/json

--- request body ---
{"handle":"qa-618ff400febe","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07a25348-2d3e-4ab7-a449-d4be22a28848
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07a25348-2d3e-4ab7-a449-d4be22a28848"}
```
