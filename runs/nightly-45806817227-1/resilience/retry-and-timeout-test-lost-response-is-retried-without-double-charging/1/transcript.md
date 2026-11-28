# Transcript: A lost response is retried with the same key and the purchase is charged once

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#lostResponseIsRetriedWithoutDoubleCharging` |
| Features | FEAT-RES-01, FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-68f5886a-2092-41a2-ae8d-9d8e07bf6afc` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-78447914-47e5-464d-af74-759ca6fcee6d` |
| 3 | `POST /v1/credits/purchases` | 503 | 14 | `qa-dcda256a-2ca2-414a-9fc9-51026f2c778a` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-bbb3974d-8aa7-4b58-87a9-3a1a554c13de` |
| 5 | `GET /v1/credits/ledger` | 200 | 15 | `qa-e8ee80a4-d9c4-4c69-9e0d-78da14ffdbe8` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-197d4d6f-b22f-4244-8017-4c9b946d1bd6` |
| 7 | `POST /v1/auth/token` | 401 | 8 | `qa-bbc08b04-2939-4874-af6a-781266f0289d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68f5886a-2092-41a2-ae8d-9d8e07bf6afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f5886a-2092-41a2-ae8d-9d8e07bf6afc
Content-Type: application/json

--- request body ---
{"handle":"qa-eefa64132521","displayName":"QA eefa64132521","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-68f5886a-2092-41a2-ae8d-9d8e07bf6afc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-eefa64132521
X-Served-Region: eu
Content-Length: 181

{"id":"acc_231b3eaa-0183-4908-acde-3f9b7bc4b0fa","handle":"qa-eefa64132521","displayName":"QA eefa64132521","region":"eu","role":"user","createdAt":"2026-11-26T11:02:30.342599324Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-78447914-47e5-464d-af74-759ca6fcee6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78447914-47e5-464d-af74-759ca6fcee6d
Content-Type: application/json

--- request body ---
{"handle":"qa-eefa64132521","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-78447914-47e5-464d-af74-759ca6fcee6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_231b3eaa-0183-4908-acde-3f9b7bc4b0fa"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dcda256a-2ca2-414a-9fc9-51026f2c778a

--- request headers ---
Accept: application/json
X-Fault: drop-response
X-Fault-Key: c7d5662a-79b9-43d3-823f-51c1f9b72cbe
Idempotency-Key: qa-83f1a420c4364c33a912fcf463025774
X-Correlation-Id: qa-dcda256a-2ca2-414a-9fc9-51026f2c778a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-dcda256a-2ca2-414a-9fc9-51026f2c778a
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
Location: /v1/credits/purchases/pur_d07630fa-127f-4725-8cc8-e6fa2f0f3998
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-dcda256a-2ca2-414a-9fc9-51026f2c778a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bbb3974d-8aa7-4b58-87a9-3a1a554c13de

--- request headers ---
Accept: application/json
X-Fault: drop-response
X-Fault-Key: c7d5662a-79b9-43d3-823f-51c1f9b72cbe
Idempotency-Key: qa-83f1a420c4364c33a912fcf463025774
X-Correlation-Id: qa-bbb3974d-8aa7-4b58-87a9-3a1a554c13de
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbb3974d-8aa7-4b58-87a9-3a1a554c13de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
Location: /v1/credits/purchases/pur_d07630fa-127f-4725-8cc8-e6fa2f0f3998
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_d07630fa-127f-4725-8cc8-e6fa2f0f3998","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:30.407883038Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-e8ee80a4-d9c4-4c69-9e0d-78da14ffdbe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8ee80a4-d9c4-4c69-9e0d-78da14ffdbe8
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8ee80a4-d9c4-4c69-9e0d-78da14ffdbe8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 398

{"items":[{"id":"led_96929ccc-7051-45ab-b1a7-e6cfa3c76040","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-26T11:02:30.342609540Z"},{"id":"led_a1a99a82-bca1-4578-a0af-9be5c26fcd4e","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_d07630fa-127f-4725-8cc8-e6fa2f0f3998","createdAt":"2026-11-26T11:02:30.407883038Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-197d4d6f-b22f-4244-8017-4c9b946d1bd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-197d4d6f-b22f-4244-8017-4c9b946d1bd6
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-197d4d6f-b22f-4244-8017-4c9b946d1bd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 9
X-Served-Region: eu
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-bbc08b04-2939-4874-af6a-781266f0289d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbc08b04-2939-4874-af6a-781266f0289d
Content-Type: application/json

--- request body ---
{"handle":"qa-eefa64132521","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbc08b04-2939-4874-af6a-781266f0289d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bbc08b04-2939-4874-af6a-781266f0289d"}
```
