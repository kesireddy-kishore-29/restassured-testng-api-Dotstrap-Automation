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
| 1 | `POST /v1/accounts` | 201 | 482 | `qa-83cf238d-2e17-489d-9bc8-9822e77c1795` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-d6d8327c-fd96-49ba-a39a-f52933cb76ca` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-212d797d-18fc-4afb-8874-2ea72acce8a4` |
| 4 | `POST /v1/credits/purchases` | 201 | 37 | `qa-2a0a1b4f-1492-4d8f-a057-98890cd5bfac` |
| 5 | `POST /v1/auth/token` | 200 | 23 | `qa-f39d448e-5873-469e-be42-546af8d025ee` |
| 6 | `POST /v1/credits/purchases` | 201 | 19 | `qa-df6ecbc9-0233-496d-ab47-6d5e4d5a3f0d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-e3fedbfc-c68f-41e2-8adb-756b45dcd039` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-a541b23d-f9fb-47b8-b2a1-b2512727f9bc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-c54ee77a-3a12-4a84-a057-dce618c815a0` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-5fd17830-9c63-4535-897f-47d525bb8df8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-83cf238d-2e17-489d-9bc8-9822e77c1795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83cf238d-2e17-489d-9bc8-9822e77c1795
Content-Type: application/json

--- request body ---
{"handle":"qa-ca755acc7824","displayName":"QA ca755acc7824","password":"****","region":"eu"}

--- response: 201 in 482 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-83cf238d-2e17-489d-9bc8-9822e77c1795
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
Location: /v1/accounts/qa-ca755acc7824
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba1c8883-9341-4aa2-8565-7ce574d4cd4f","handle":"qa-ca755acc7824","displayName":"QA ca755acc7824","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.713879878Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d6d8327c-fd96-49ba-a39a-f52933cb76ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6d8327c-fd96-49ba-a39a-f52933cb76ca
Content-Type: application/json

--- request body ---
{"handle":"qa-fa05805f37d9","displayName":"QA fa05805f37d9","password":"****","region":"us"}

--- response: 201 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6d8327c-fd96-49ba-a39a-f52933cb76ca
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
Location: /v1/accounts/qa-fa05805f37d9
X-Served-Region: us
Content-Length: 181

{"id":"acc_51adf669-9f03-4987-a49a-81975fb2869a","handle":"qa-fa05805f37d9","displayName":"QA fa05805f37d9","region":"us","role":"user","createdAt":"2026-11-12T09:56:36.154623563Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-212d797d-18fc-4afb-8874-2ea72acce8a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-212d797d-18fc-4afb-8874-2ea72acce8a4
Content-Type: application/json

--- request body ---
{"handle":"qa-ca755acc7824","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-212d797d-18fc-4afb-8874-2ea72acce8a4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba1c8883-9341-4aa2-8565-7ce574d4cd4f"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2a0a1b4f-1492-4d8f-a057-98890cd5bfac

--- request headers ---
Accept: application/json
Idempotency-Key: qa-06d045aadcb6448b98f5f6b51f58ee8d
X-Correlation-Id: qa-2a0a1b4f-1492-4d8f-a057-98890cd5bfac
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a0a1b4f-1492-4d8f-a057-98890cd5bfac
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
Location: /v1/credits/purchases/pur_59c7dc00-9f6f-46c2-a9aa-63bf6f12c412
Content-Length: 144

{"id":"pur_59c7dc00-9f6f-46c2-a9aa-63bf6f12c412","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.326371397Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f39d448e-5873-469e-be42-546af8d025ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f39d448e-5873-469e-be42-546af8d025ee
Content-Type: application/json

--- request body ---
{"handle":"qa-fa05805f37d9","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f39d448e-5873-469e-be42-546af8d025ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51adf669-9f03-4987-a49a-81975fb2869a"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-df6ecbc9-0233-496d-ab47-6d5e4d5a3f0d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-06d045aadcb6448b98f5f6b51f58ee8d
X-Correlation-Id: qa-df6ecbc9-0233-496d-ab47-6d5e4d5a3f0d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-df6ecbc9-0233-496d-ab47-6d5e4d5a3f0d
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
Location: /v1/credits/purchases/pur_c852db04-5340-4881-a978-8ae5eff635c0
Content-Length: 144

{"id":"pur_c852db04-5340-4881-a978-8ae5eff635c0","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-12T09:56:36.414912920Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3fedbfc-c68f-41e2-8adb-756b45dcd039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3fedbfc-c68f-41e2-8adb-756b45dcd039
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3fedbfc-c68f-41e2-8adb-756b45dcd039
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
correlation: qa-a541b23d-f9fb-47b8-b2a1-b2512727f9bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a541b23d-f9fb-47b8-b2a1-b2512727f9bc
Content-Type: application/json

--- request body ---
{"handle":"qa-fa05805f37d9","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a541b23d-f9fb-47b8-b2a1-b2512727f9bc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a541b23d-f9fb-47b8-b2a1-b2512727f9bc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c54ee77a-3a12-4a84-a057-dce618c815a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c54ee77a-3a12-4a84-a057-dce618c815a0
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c54ee77a-3a12-4a84-a057-dce618c815a0
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
correlation: qa-5fd17830-9c63-4535-897f-47d525bb8df8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd17830-9c63-4535-897f-47d525bb8df8
Content-Type: application/json

--- request body ---
{"handle":"qa-ca755acc7824","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fd17830-9c63-4535-897f-47d525bb8df8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5fd17830-9c63-4535-897f-47d525bb8df8"}
```
