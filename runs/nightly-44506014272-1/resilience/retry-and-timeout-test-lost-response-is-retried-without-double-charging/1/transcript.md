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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-8740b9ec-c0eb-4422-b389-05fb79b2a85f` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-da98b23a-137a-4371-94e6-812170313f6a` |
| 3 | `POST /v1/credits/purchases` | 503 | 10 | `qa-b0fa486a-348e-4b15-b99c-3032595abc28` |
| 4 | `POST /v1/credits/purchases` | 200 | 6 | `qa-217b7c80-0720-4347-84cd-0d94f55aa628` |
| 5 | `GET /v1/credits/ledger` | 200 | 9 | `qa-41597b15-5211-4a49-9a9f-bb52d2af0dd0` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ffc4f617-3ad8-46d8-b376-8b4b52af6669` |
| 7 | `POST /v1/auth/token` | 401 | 3 | `qa-14d1d9e6-53f9-4939-85f0-92c91ee16dc2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8740b9ec-c0eb-4422-b389-05fb79b2a85f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8740b9ec-c0eb-4422-b389-05fb79b2a85f
Content-Type: application/json

--- request body ---
{"handle":"qa-e02123db02a1","displayName":"QA e02123db02a1","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8740b9ec-c0eb-4422-b389-05fb79b2a85f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-e02123db02a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bcc14b2b-cd74-43bb-8da3-6269d4cfb11e","handle":"qa-e02123db02a1","displayName":"QA e02123db02a1","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.005680502Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-da98b23a-137a-4371-94e6-812170313f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da98b23a-137a-4371-94e6-812170313f6a
Content-Type: application/json

--- request body ---
{"handle":"qa-e02123db02a1","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-da98b23a-137a-4371-94e6-812170313f6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bcc14b2b-cd74-43bb-8da3-6269d4cfb11e"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b0fa486a-348e-4b15-b99c-3032595abc28

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-9908da3df25240f2b47efeae2c63e33a
X-Fault-Key: ecbb1747-5ff6-41ed-b8be-c25103c3b036
X-Correlation-Id: qa-b0fa486a-348e-4b15-b99c-3032595abc28
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-b0fa486a-348e-4b15-b99c-3032595abc28
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
Location: /v1/credits/purchases/pur_4f7540b0-284e-48fd-87e9-c67a2927d198
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-b0fa486a-348e-4b15-b99c-3032595abc28"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-217b7c80-0720-4347-84cd-0d94f55aa628

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-9908da3df25240f2b47efeae2c63e33a
X-Fault-Key: ecbb1747-5ff6-41ed-b8be-c25103c3b036
X-Correlation-Id: qa-217b7c80-0720-4347-84cd-0d94f55aa628
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-217b7c80-0720-4347-84cd-0d94f55aa628
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
Location: /v1/credits/purchases/pur_4f7540b0-284e-48fd-87e9-c67a2927d198
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_4f7540b0-284e-48fd-87e9-c67a2927d198","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-19T10:29:13.049761339Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-41597b15-5211-4a49-9a9f-bb52d2af0dd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41597b15-5211-4a49-9a9f-bb52d2af0dd0
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-41597b15-5211-4a49-9a9f-bb52d2af0dd0
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

{"items":[{"id":"led_627a4776-a015-4980-951b-2482dd9a3ed6","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-19T10:29:13.005692280Z"},{"id":"led_5d85412f-d027-4978-b376-ab172c29e7e9","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_4f7540b0-284e-48fd-87e9-c67a2927d198","createdAt":"2026-11-19T10:29:13.049761339Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ffc4f617-3ad8-46d8-b376-8b4b52af6669

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffc4f617-3ad8-46d8-b376-8b4b52af6669
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ffc4f617-3ad8-46d8-b376-8b4b52af6669
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
correlation: qa-14d1d9e6-53f9-4939-85f0-92c91ee16dc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d1d9e6-53f9-4939-85f0-92c91ee16dc2
Content-Type: application/json

--- request body ---
{"handle":"qa-e02123db02a1","password":"****"}

--- response: 401 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14d1d9e6-53f9-4939-85f0-92c91ee16dc2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-14d1d9e6-53f9-4939-85f0-92c91ee16dc2"}
```
