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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-66ef9fe2-3219-425a-9e9a-e3cbf789f266` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-e1778762-d78c-4bc6-a41c-56eb45f1a4fd` |
| 3 | `POST /v1/credits/purchases` | 503 | 16 | `qa-55ffa545-a693-44d9-9d6e-fab9eabed864` |
| 4 | `POST /v1/credits/purchases` | 200 | 7 | `qa-30a61243-dbc5-4519-85a6-702eccf73a57` |
| 5 | `GET /v1/credits/ledger` | 200 | 13 | `qa-7efe3f01-4585-45d5-83e2-0ff73db54c38` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ffa88dff-f919-4e66-bc0b-461dc5789efa` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-11de6fcf-65ad-4e9b-9aeb-14391ffdffb9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-66ef9fe2-3219-425a-9e9a-e3cbf789f266

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ef9fe2-3219-425a-9e9a-e3cbf789f266
Content-Type: application/json

--- request body ---
{"handle":"qa-07134c140408","displayName":"QA 07134c140408","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-66ef9fe2-3219-425a-9e9a-e3cbf789f266
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
Location: /v1/accounts/qa-07134c140408
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f49407d-5b0c-4939-8249-351cb0ccf905","handle":"qa-07134c140408","displayName":"QA 07134c140408","region":"eu","role":"user","createdAt":"2026-11-04T09:28:15.279662438Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e1778762-d78c-4bc6-a41c-56eb45f1a4fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1778762-d78c-4bc6-a41c-56eb45f1a4fd
Content-Type: application/json

--- request body ---
{"handle":"qa-07134c140408","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1778762-d78c-4bc6-a41c-56eb45f1a4fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f49407d-5b0c-4939-8249-351cb0ccf905"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-55ffa545-a693-44d9-9d6e-fab9eabed864

--- request headers ---
Accept: application/json
Idempotency-Key: qa-15312aea432a472cb2cc016ef01890e2
X-Fault-Key: 8e3595fe-25a2-4e14-bf53-ad8169de1dbd
X-Fault: drop-response
X-Correlation-Id: qa-55ffa545-a693-44d9-9d6e-fab9eabed864
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-55ffa545-a693-44d9-9d6e-fab9eabed864
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
Location: /v1/credits/purchases/pur_bcb3c8f8-93b3-4a40-911a-dc446437b46d
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-55ffa545-a693-44d9-9d6e-fab9eabed864"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-30a61243-dbc5-4519-85a6-702eccf73a57

--- request headers ---
Accept: application/json
Idempotency-Key: qa-15312aea432a472cb2cc016ef01890e2
X-Fault-Key: 8e3595fe-25a2-4e14-bf53-ad8169de1dbd
X-Fault: drop-response
X-Correlation-Id: qa-30a61243-dbc5-4519-85a6-702eccf73a57
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-30a61243-dbc5-4519-85a6-702eccf73a57
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
Location: /v1/credits/purchases/pur_bcb3c8f8-93b3-4a40-911a-dc446437b46d
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_bcb3c8f8-93b3-4a40-911a-dc446437b46d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-04T09:28:15.342044652Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-7efe3f01-4585-45d5-83e2-0ff73db54c38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7efe3f01-4585-45d5-83e2-0ff73db54c38
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-7efe3f01-4585-45d5-83e2-0ff73db54c38
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

{"items":[{"id":"led_dc0ff2e4-4157-460b-80b0-7b5cf617870b","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-04T09:28:15.279674882Z"},{"id":"led_23acd94f-3e02-4077-bbc1-5285a39ed6f2","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_bcb3c8f8-93b3-4a40-911a-dc446437b46d","createdAt":"2026-11-04T09:28:15.342044652Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ffa88dff-f919-4e66-bc0b-461dc5789efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffa88dff-f919-4e66-bc0b-461dc5789efa
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ffa88dff-f919-4e66-bc0b-461dc5789efa
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
correlation: qa-11de6fcf-65ad-4e9b-9aeb-14391ffdffb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11de6fcf-65ad-4e9b-9aeb-14391ffdffb9
Content-Type: application/json

--- request body ---
{"handle":"qa-07134c140408","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11de6fcf-65ad-4e9b-9aeb-14391ffdffb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-11de6fcf-65ad-4e9b-9aeb-14391ffdffb9"}
```
