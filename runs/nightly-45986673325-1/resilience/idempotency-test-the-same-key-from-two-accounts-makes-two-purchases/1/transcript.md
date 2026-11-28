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
| 1 | `POST /v1/accounts` | 201 | 322 | `qa-e5e76122-3c49-4c1c-b63b-22552770da0c` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-a34b8e6f-752a-46ce-b46c-4087a9866e42` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-bd5794d7-8811-4854-be22-26c851c6d0fd` |
| 4 | `POST /v1/credits/purchases` | 201 | 49 | `qa-28bddf38-e3cd-457f-ac12-f867ce0e53eb` |
| 5 | `POST /v1/auth/token` | 200 | 24 | `qa-33126ddb-c320-49fc-a2bf-351568167072` |
| 6 | `POST /v1/credits/purchases` | 201 | 14 | `qa-867934eb-2e88-4ee4-9d14-8e2479fb95eb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-c5a9422f-6b8d-4fec-b220-a930ce755bdc` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-28cde9bf-911c-4e1c-a501-9c7d0a6d99a1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-a80846c7-2096-48fb-9aca-02a06f78f680` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-2aedbf3d-cb52-49b2-9a3e-982e783d3da9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5e76122-3c49-4c1c-b63b-22552770da0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e76122-3c49-4c1c-b63b-22552770da0c
Content-Type: application/json

--- request body ---
{"handle":"qa-75b090a05f10","displayName":"QA 75b090a05f10","password":"****","region":"eu"}

--- response: 201 in 322 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5e76122-3c49-4c1c-b63b-22552770da0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-75b090a05f10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f29fc84-a42e-4741-b9bc-2f1d5486491c","handle":"qa-75b090a05f10","displayName":"QA 75b090a05f10","region":"eu","role":"user","createdAt":"2026-11-27T10:59:48.122810994Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a34b8e6f-752a-46ce-b46c-4087a9866e42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a34b8e6f-752a-46ce-b46c-4087a9866e42
Content-Type: application/json

--- request body ---
{"handle":"qa-ab0105ad70ae","displayName":"QA ab0105ad70ae","password":"****","region":"us"}

--- response: 201 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a34b8e6f-752a-46ce-b46c-4087a9866e42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-ab0105ad70ae
X-Served-Region: us
Content-Length: 181

{"id":"acc_559b0fa3-68e7-412f-bac5-bf718c59b617","handle":"qa-ab0105ad70ae","displayName":"QA ab0105ad70ae","region":"us","role":"user","createdAt":"2026-11-27T10:59:48.452958769Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bd5794d7-8811-4854-be22-26c851c6d0fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd5794d7-8811-4854-be22-26c851c6d0fd
Content-Type: application/json

--- request body ---
{"handle":"qa-75b090a05f10","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd5794d7-8811-4854-be22-26c851c6d0fd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f29fc84-a42e-4741-b9bc-2f1d5486491c"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-28bddf38-e3cd-457f-ac12-f867ce0e53eb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ad7aeba642e644fda126303d3698f103
X-Correlation-Id: qa-28bddf38-e3cd-457f-ac12-f867ce0e53eb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 49 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-28bddf38-e3cd-457f-ac12-f867ce0e53eb
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
Location: /v1/credits/purchases/pur_cc22bf11-fef0-4306-b694-7b9e507d3819
Content-Length: 144

{"id":"pur_cc22bf11-fef0-4306-b694-7b9e507d3819","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.585203620Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-33126ddb-c320-49fc-a2bf-351568167072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33126ddb-c320-49fc-a2bf-351568167072
Content-Type: application/json

--- request body ---
{"handle":"qa-ab0105ad70ae","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-33126ddb-c320-49fc-a2bf-351568167072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_559b0fa3-68e7-412f-bac5-bf718c59b617"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-867934eb-2e88-4ee4-9d14-8e2479fb95eb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ad7aeba642e644fda126303d3698f103
X-Correlation-Id: qa-867934eb-2e88-4ee4-9d14-8e2479fb95eb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-867934eb-2e88-4ee4-9d14-8e2479fb95eb
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
Location: /v1/credits/purchases/pur_3a9726d1-a8e9-4bd7-8243-8b983170da75
Content-Length: 144

{"id":"pur_3a9726d1-a8e9-4bd7-8243-8b983170da75","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.661184902Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5a9422f-6b8d-4fec-b220-a930ce755bdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5a9422f-6b8d-4fec-b220-a930ce755bdc
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5a9422f-6b8d-4fec-b220-a930ce755bdc
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
correlation: qa-28cde9bf-911c-4e1c-a501-9c7d0a6d99a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28cde9bf-911c-4e1c-a501-9c7d0a6d99a1
Content-Type: application/json

--- request body ---
{"handle":"qa-ab0105ad70ae","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28cde9bf-911c-4e1c-a501-9c7d0a6d99a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-28cde9bf-911c-4e1c-a501-9c7d0a6d99a1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a80846c7-2096-48fb-9aca-02a06f78f680

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a80846c7-2096-48fb-9aca-02a06f78f680
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a80846c7-2096-48fb-9aca-02a06f78f680
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
correlation: qa-2aedbf3d-cb52-49b2-9a3e-982e783d3da9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aedbf3d-cb52-49b2-9a3e-982e783d3da9
Content-Type: application/json

--- request body ---
{"handle":"qa-75b090a05f10","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2aedbf3d-cb52-49b2-9a3e-982e783d3da9
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2aedbf3d-cb52-49b2-9a3e-982e783d3da9"}
```
