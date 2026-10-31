# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-9e10cc6b-8959-4bd3-87b5-60f900c8096a` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-193b6d75-868b-4208-8311-5732a6d17916` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-728e19b8-e126-4d23-bd41-94992c9f4816` |
| 4 | `POST /v1/credits/purchases` | 201 | 7 | `qa-19c23937-10d5-4428-983f-2eac54c51d7f` |
| 5 | `POST /v1/auth/token` | 200 | 9 | `qa-b1cdf05e-7f1c-4d77-a921-5b1e4af21063` |
| 6 | `POST /v1/credits/purchases` | 201 | 5 | `qa-f28a7b38-ada9-4f89-aaf8-157acffa3d72` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-838ec398-a36c-4ab3-9f50-119115a49a27` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-8de9782e-8329-459b-b2cd-2aef96f9e386` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-00ad2579-01a9-4fd1-9b7a-82faf57ddfd4` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-47e1d742-b610-495d-90b3-9cbaae91db27` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e10cc6b-8959-4bd3-87b5-60f900c8096a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e10cc6b-8959-4bd3-87b5-60f900c8096a
Content-Type: application/json

--- request body ---
{"handle":"qa-54f389fbf2cb","displayName":"QA 54f389fbf2cb","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e10cc6b-8959-4bd3-87b5-60f900c8096a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-54f389fbf2cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa01edba-2482-45ec-8826-dd084da6be57","handle":"qa-54f389fbf2cb","displayName":"QA 54f389fbf2cb","region":"eu","role":"user","createdAt":"2026-10-26T07:54:44.399204767Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-193b6d75-868b-4208-8311-5732a6d17916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-193b6d75-868b-4208-8311-5732a6d17916
Content-Type: application/json

--- request body ---
{"handle":"qa-4bd2c58444eb","displayName":"QA 4bd2c58444eb","password":"****","region":"us"}

--- response: 201 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-193b6d75-868b-4208-8311-5732a6d17916
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
Location: /v1/accounts/qa-4bd2c58444eb
X-Served-Region: us
Content-Length: 181

{"id":"acc_4ca877bc-76e6-4276-b781-f42881275a61","handle":"qa-4bd2c58444eb","displayName":"QA 4bd2c58444eb","region":"us","role":"user","createdAt":"2026-10-26T07:54:44.426543826Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-728e19b8-e126-4d23-bd41-94992c9f4816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-728e19b8-e126-4d23-bd41-94992c9f4816
Content-Type: application/json

--- request body ---
{"handle":"qa-54f389fbf2cb","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-728e19b8-e126-4d23-bd41-94992c9f4816
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa01edba-2482-45ec-8826-dd084da6be57"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-19c23937-10d5-4428-983f-2eac54c51d7f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-499bf5acadb2465a999bcffee0fe1972
X-Correlation-Id: qa-19c23937-10d5-4428-983f-2eac54c51d7f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-19c23937-10d5-4428-983f-2eac54c51d7f
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
Location: /v1/credits/purchases/pur_1bd6f9fa-10bd-422e-96a4-aa828995da14
Content-Length: 144

{"id":"pur_1bd6f9fa-10bd-422e-96a4-aa828995da14","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:44.465009157Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b1cdf05e-7f1c-4d77-a921-5b1e4af21063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1cdf05e-7f1c-4d77-a921-5b1e4af21063
Content-Type: application/json

--- request body ---
{"handle":"qa-4bd2c58444eb","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1cdf05e-7f1c-4d77-a921-5b1e4af21063
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ca877bc-76e6-4276-b781-f42881275a61"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f28a7b38-ada9-4f89-aaf8-157acffa3d72

--- request headers ---
Accept: application/json
Idempotency-Key: qa-499bf5acadb2465a999bcffee0fe1972
X-Correlation-Id: qa-f28a7b38-ada9-4f89-aaf8-157acffa3d72
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-f28a7b38-ada9-4f89-aaf8-157acffa3d72
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_64a799bf-8fdd-4ae4-9043-4ae1b4511e42
Content-Length: 144

{"id":"pur_64a799bf-8fdd-4ae4-9043-4ae1b4511e42","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:44.491257112Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-838ec398-a36c-4ab3-9f50-119115a49a27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-838ec398-a36c-4ab3-9f50-119115a49a27
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-838ec398-a36c-4ab3-9f50-119115a49a27
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
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-8de9782e-8329-459b-b2cd-2aef96f9e386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8de9782e-8329-459b-b2cd-2aef96f9e386
Content-Type: application/json

--- request body ---
{"handle":"qa-4bd2c58444eb","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8de9782e-8329-459b-b2cd-2aef96f9e386
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8de9782e-8329-459b-b2cd-2aef96f9e386"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00ad2579-01a9-4fd1-9b7a-82faf57ddfd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00ad2579-01a9-4fd1-9b7a-82faf57ddfd4
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00ad2579-01a9-4fd1-9b7a-82faf57ddfd4
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-47e1d742-b610-495d-90b3-9cbaae91db27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47e1d742-b610-495d-90b3-9cbaae91db27
Content-Type: application/json

--- request body ---
{"handle":"qa-54f389fbf2cb","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47e1d742-b610-495d-90b3-9cbaae91db27
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47e1d742-b610-495d-90b3-9cbaae91db27"}
```
