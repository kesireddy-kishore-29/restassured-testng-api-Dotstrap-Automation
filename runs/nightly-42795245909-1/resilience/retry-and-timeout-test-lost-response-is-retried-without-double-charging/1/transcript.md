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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-45273d9f-f888-478b-9ce9-6fa22d676282` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-d0e108bd-1ae7-45d8-aa86-31ab2f535b50` |
| 3 | `POST /v1/credits/purchases` | 503 | 7 | `qa-475262da-0568-4055-b15b-e49d931a1c55` |
| 4 | `POST /v1/credits/purchases` | 200 | 11 | `qa-5fee782e-2013-454c-b33a-91ef8db56499` |
| 5 | `GET /v1/credits/ledger` | 200 | 16 | `qa-fab25d85-f3a2-4ee9-9a05-6c4bbac241da` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-4d6bcecc-0f6b-4133-84a0-76a66e842ffe` |
| 7 | `POST /v1/auth/token` | 401 | 5 | `qa-351d8aaf-0718-471d-b30f-80caf2e62b9f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-45273d9f-f888-478b-9ce9-6fa22d676282

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45273d9f-f888-478b-9ce9-6fa22d676282
Content-Type: application/json

--- request body ---
{"handle":"qa-5c46bc8ee25e","displayName":"QA 5c46bc8ee25e","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-45273d9f-f888-478b-9ce9-6fa22d676282
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-5c46bc8ee25e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05d2df4b-7912-40aa-aa84-bc0f320b3862","handle":"qa-5c46bc8ee25e","displayName":"QA 5c46bc8ee25e","region":"eu","role":"user","createdAt":"2026-11-10T09:59:28.728564530Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d0e108bd-1ae7-45d8-aa86-31ab2f535b50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0e108bd-1ae7-45d8-aa86-31ab2f535b50
Content-Type: application/json

--- request body ---
{"handle":"qa-5c46bc8ee25e","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0e108bd-1ae7-45d8-aa86-31ab2f535b50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05d2df4b-7912-40aa-aa84-bc0f320b3862"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-475262da-0568-4055-b15b-e49d931a1c55

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-0dd96192727a45c1889ebc7f7df6427a
X-Fault-Key: cca79003-63de-4a1b-af2b-94258776b3ff
X-Correlation-Id: qa-475262da-0568-4055-b15b-e49d931a1c55
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/problem+json;charset=utf-8
X-Correlation-Id: qa-475262da-0568-4055-b15b-e49d931a1c55
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
Location: /v1/credits/purchases/pur_9b3d446f-2330-494e-92f0-dd5360c79a1b
Retry-After: 1
Content-Length: 285

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected: the request completed but the response was lost.","instance":"/v1/credits/purchases","correlationId":"qa-475262da-0568-4055-b15b-e49d931a1c55"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5fee782e-2013-454c-b33a-91ef8db56499

--- request headers ---
Accept: application/json
X-Fault: drop-response
Idempotency-Key: qa-0dd96192727a45c1889ebc7f7df6427a
X-Fault-Key: cca79003-63de-4a1b-af2b-94258776b3ff
X-Correlation-Id: qa-5fee782e-2013-454c-b33a-91ef8db56499
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fee782e-2013-454c-b33a-91ef8db56499
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
Location: /v1/credits/purchases/pur_9b3d446f-2330-494e-92f0-dd5360c79a1b
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_9b3d446f-2330-494e-92f0-dd5360c79a1b","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.767459725Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-fab25d85-f3a2-4ee9-9a05-6c4bbac241da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab25d85-f3a2-4ee9-9a05-6c4bbac241da
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-fab25d85-f3a2-4ee9-9a05-6c4bbac241da
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

{"items":[{"id":"led_f842f7d5-4ef4-4361-82fe-cf3afb749f29","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-10T09:59:28.728572362Z"},{"id":"led_039180ff-0c3a-4311-b0fb-02fa80d83c43","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_9b3d446f-2330-494e-92f0-dd5360c79a1b","createdAt":"2026-11-10T09:59:28.767459725Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d6bcecc-0f6b-4133-84a0-76a66e842ffe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d6bcecc-0f6b-4133-84a0-76a66e842ffe
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d6bcecc-0f6b-4133-84a0-76a66e842ffe
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
correlation: qa-351d8aaf-0718-471d-b30f-80caf2e62b9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-351d8aaf-0718-471d-b30f-80caf2e62b9f
Content-Type: application/json

--- request body ---
{"handle":"qa-5c46bc8ee25e","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-351d8aaf-0718-471d-b30f-80caf2e62b9f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-351d8aaf-0718-471d-b30f-80caf2e62b9f"}
```
