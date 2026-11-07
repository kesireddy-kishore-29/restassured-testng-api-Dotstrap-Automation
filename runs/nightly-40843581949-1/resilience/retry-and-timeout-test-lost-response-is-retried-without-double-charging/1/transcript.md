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
| 1 | `POST /v1/accounts` | 201 | 397 | `qa-2d088844-eae1-4529-976a-6adb5a43bec0` |
| 2 | `POST /v1/auth/token` | 200 | 61 | `qa-600c2ee6-7bce-4253-b216-16f249ec0958` |
| 3 | `POST /v1/credits/purchases` | 503 | 113 | `qa-9bb64961-84d4-40f9-9e39-67037ace874b` |
| 4 | `POST /v1/credits/purchases` | 200 | 8 | `qa-bc8df4d7-6900-4331-9cc1-df634fb8c2c6` |
| 5 | `GET /v1/credits/ledger` | 200 | 27 | `qa-d971125f-22fe-427b-ac76-1485997c991c` |
| 6 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-23884a4c-9736-4414-86ed-ed5434880dbd` |
| 7 | `POST /v1/auth/token` | 401 | 14 | `qa-3264e124-00b0-4997-b8b2-4ff7005be4b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d088844-eae1-4529-976a-6adb5a43bec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d088844-eae1-4529-976a-6adb5a43bec0
Content-Type: application/json

--- request body ---
{"handle":"qa-cdfb4a3d6b31","displayName":"QA cdfb4a3d6b31","password":"****","region":"eu"}

--- response: 201 in 397 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d088844-eae1-4529-976a-6adb5a43bec0
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
Location: /v1/accounts/qa-cdfb4a3d6b31
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d136116f-ea55-43d4-95b0-b2d321d8dce3","handle":"qa-cdfb4a3d6b31","displayName":"QA cdfb4a3d6b31","region":"eu","role":"user","createdAt":"2026-10-29T08:38:56.705428702Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-600c2ee6-7bce-4253-b216-16f249ec0958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-600c2ee6-7bce-4253-b216-16f249ec0958
Content-Type: application/json

--- request body ---
{"handle":"qa-cdfb4a3d6b31","password":"****"}

--- response: 200 in 61 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-600c2ee6-7bce-4253-b216-16f249ec0958
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d136116f-ea55-43d4-95b0-b2d321d8dce3"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9bb64961-84d4-40f9-9e39-67037ace874b

--- request headers ---
Accept: application/json
X-Fault: drop-response
X-Fault-Key: 997a8863-abaa-41a1-9aaa-da8ad2ed7faa
Idempotency-Key: qa-738ea26def304feb92424ddd276b2f4d
X-Correlation-Id: qa-9bb64961-84d4-40f9-9e39-67037ace874b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 113 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-9bb64961-84d4-40f9-9e39-67037ace874b
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
Location: /v1/credits/purchases/pur_07e931a7-602f-4cde-82e5-91e8db0aebb9
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-9bb64961-84d4-40f9-9e39-67037ace874b"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bc8df4d7-6900-4331-9cc1-df634fb8c2c6

--- request headers ---
Accept: application/json
X-Fault: drop-response
X-Fault-Key: 997a8863-abaa-41a1-9aaa-da8ad2ed7faa
Idempotency-Key: qa-738ea26def304feb92424ddd276b2f4d
X-Correlation-Id: qa-bc8df4d7-6900-4331-9cc1-df634fb8c2c6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc8df4d7-6900-4331-9cc1-df634fb8c2c6
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
Location: /v1/credits/purchases/pur_07e931a7-602f-4cde-82e5-91e8db0aebb9
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_07e931a7-602f-4cde-82e5-91e8db0aebb9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-29T08:38:57.422577408Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d971125f-22fe-427b-ac76-1485997c991c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d971125f-22fe-427b-ac76-1485997c991c
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d971125f-22fe-427b-ac76-1485997c991c
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

{"items":[{"id":"led_47f986de-b309-43c4-a9af-2e3072866a8c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-29T08:38:56.705451876Z"},{"id":"led_ac31e6db-6639-4c54-b20f-439492b42a70","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_07e931a7-602f-4cde-82e5-91e8db0aebb9","createdAt":"2026-10-29T08:38:57.422577408Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23884a4c-9736-4414-86ed-ed5434880dbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23884a4c-9736-4414-86ed-ed5434880dbd
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23884a4c-9736-4414-86ed-ed5434880dbd
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
correlation: qa-3264e124-00b0-4997-b8b2-4ff7005be4b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3264e124-00b0-4997-b8b2-4ff7005be4b8
Content-Type: application/json

--- request body ---
{"handle":"qa-cdfb4a3d6b31","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3264e124-00b0-4997-b8b2-4ff7005be4b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3264e124-00b0-4997-b8b2-4ff7005be4b8"}
```
