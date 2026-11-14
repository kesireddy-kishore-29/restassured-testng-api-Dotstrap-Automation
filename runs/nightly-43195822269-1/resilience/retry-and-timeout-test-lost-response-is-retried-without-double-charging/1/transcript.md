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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-b6043e4f-364e-4d9e-bfd2-1174b6a77bbf` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-e31794d6-6f3e-498e-9454-aa30eebe841c` |
| 3 | `POST /v1/credits/purchases` | 503 | 19 | `qa-d51c7466-52fc-49f8-954f-f1729ba56e97` |
| 4 | `POST /v1/credits/purchases` | 200 | 10 | `qa-c1ab85c3-7fff-4582-ac64-e1a174c77d58` |
| 5 | `GET /v1/credits/ledger` | 200 | 23 | `qa-153aaff2-2514-493b-ac03-9ebc3a48ed11` |
| 6 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-82ca12b3-46dc-40ae-8139-de9ed0ce1d15` |
| 7 | `POST /v1/auth/token` | 401 | 6 | `qa-a6d9520d-efbb-4a11-9511-f0dad7ddfbda` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b6043e4f-364e-4d9e-bfd2-1174b6a77bbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6043e4f-364e-4d9e-bfd2-1174b6a77bbf
Content-Type: application/json

--- request body ---
{"handle":"qa-55e5abc926d2","displayName":"QA 55e5abc926d2","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6043e4f-364e-4d9e-bfd2-1174b6a77bbf
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
Location: /v1/accounts/qa-55e5abc926d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1066be7d-b1f7-4d21-a99f-2bae878235f9","handle":"qa-55e5abc926d2","displayName":"QA 55e5abc926d2","region":"eu","role":"user","createdAt":"2026-11-12T09:56:36.893660945Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e31794d6-6f3e-498e-9454-aa30eebe841c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e31794d6-6f3e-498e-9454-aa30eebe841c
Content-Type: application/json

--- request body ---
{"handle":"qa-55e5abc926d2","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e31794d6-6f3e-498e-9454-aa30eebe841c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1066be7d-b1f7-4d21-a99f-2bae878235f9"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d51c7466-52fc-49f8-954f-f1729ba56e97

--- request headers ---
Accept: application/json
Idempotency-Key: qa-10e6dc367fe34f4399b169a7f00d2edd
X-Fault: drop-response
X-Fault-Key: 718d42e4-77f5-4f97-b688-4bd1b145ae9f
X-Correlation-Id: qa-d51c7466-52fc-49f8-954f-f1729ba56e97
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-d51c7466-52fc-49f8-954f-f1729ba56e97
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
Location: /v1/credits/purchases/pur_9b106c2d-4408-46b9-b6ce-cd50198b14b0
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-d51c7466-52fc-49f8-954f-f1729ba56e97"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c1ab85c3-7fff-4582-ac64-e1a174c77d58

--- request headers ---
Accept: application/json
Idempotency-Key: qa-10e6dc367fe34f4399b169a7f00d2edd
X-Fault: drop-response
X-Fault-Key: 718d42e4-77f5-4f97-b688-4bd1b145ae9f
X-Correlation-Id: qa-c1ab85c3-7fff-4582-ac64-e1a174c77d58
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1ab85c3-7fff-4582-ac64-e1a174c77d58
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
Location: /v1/credits/purchases/pur_9b106c2d-4408-46b9-b6ce-cd50198b14b0
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9b106c2d-4408-46b9-b6ce-cd50198b14b0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.962454920Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-153aaff2-2514-493b-ac03-9ebc3a48ed11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-153aaff2-2514-493b-ac03-9ebc3a48ed11
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-153aaff2-2514-493b-ac03-9ebc3a48ed11
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

{"items":[{"id":"led_23e3ee1b-b7ed-420a-b016-7fcb01029bbd","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-12T09:56:36.893676673Z"},{"id":"led_4044db11-b2f0-4697-ac7c-b3eb45fcbe09","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_9b106c2d-4408-46b9-b6ce-cd50198b14b0","createdAt":"2026-11-12T09:56:36.962454920Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82ca12b3-46dc-40ae-8139-de9ed0ce1d15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ca12b3-46dc-40ae-8139-de9ed0ce1d15
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82ca12b3-46dc-40ae-8139-de9ed0ce1d15
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
correlation: qa-a6d9520d-efbb-4a11-9511-f0dad7ddfbda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6d9520d-efbb-4a11-9511-f0dad7ddfbda
Content-Type: application/json

--- request body ---
{"handle":"qa-55e5abc926d2","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6d9520d-efbb-4a11-9511-f0dad7ddfbda
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6d9520d-efbb-4a11-9511-f0dad7ddfbda"}
```
