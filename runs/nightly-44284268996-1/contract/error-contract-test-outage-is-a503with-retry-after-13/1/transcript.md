# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-3d78c3a0-3b4c-4ae4-b3c1-641489969092` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-22791c4b-c67f-4ee2-bc35-3c0210c5b0f3` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-66091c03-97a3-434e-af12-163a874a4f06` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-9b1421d3-ebca-4d4b-868f-ae3726768463` |
| 5 | `GET /v1/credits/balance` | 503 | 18 | `qa-bbf0e5e8-103e-498c-89d9-36547c0df566` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-6a46ffbb-d1cb-4409-ad0f-215aee33d05c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c45e102b-2b5c-441a-8780-5070b060b7b4` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-9e6a59b0-ac8e-4f98-94eb-34ca6c6afab7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-0b285fca-f2a4-4100-ae8c-1cc3727908c9` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-cf47ea7a-f873-4b5f-a11f-a77e6efa2988` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d78c3a0-3b4c-4ae4-b3c1-641489969092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d78c3a0-3b4c-4ae4-b3c1-641489969092
Content-Type: application/json

--- request body ---
{"handle":"qa-667fa3e7cfca","displayName":"QA 667fa3e7cfca","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d78c3a0-3b4c-4ae4-b3c1-641489969092
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Location: /v1/accounts/qa-667fa3e7cfca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87e2b11e-4035-4427-8ebe-03a28843c53a","handle":"qa-667fa3e7cfca","displayName":"QA 667fa3e7cfca","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.524211699Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-22791c4b-c67f-4ee2-bc35-3c0210c5b0f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22791c4b-c67f-4ee2-bc35-3c0210c5b0f3
Content-Type: application/json

--- request body ---
{"handle":"qa-2ead54f27f66","displayName":"QA 2ead54f27f66","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-22791c4b-c67f-4ee2-bc35-3c0210c5b0f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Location: /v1/accounts/qa-2ead54f27f66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c641cd08-5ed6-4a32-9a42-cfbef07ced79","handle":"qa-2ead54f27f66","displayName":"QA 2ead54f27f66","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.573193799Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-66091c03-97a3-434e-af12-163a874a4f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66091c03-97a3-434e-af12-163a874a4f06
Content-Type: application/json

--- request body ---
{"handle":"qa-667fa3e7cfca","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-66091c03-97a3-434e-af12-163a874a4f06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87e2b11e-4035-4427-8ebe-03a28843c53a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9b1421d3-ebca-4d4b-868f-ae3726768463

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b1421d3-ebca-4d4b-868f-ae3726768463
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2ead54f27f66","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b1421d3-ebca-4d4b-868f-ae3726768463
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
Location: /v1/conversations/cnv_ceaf242f-8a6e-41ca-b5d4-b7c1ddd031b4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ceaf242f-8a6e-41ca-b5d4-b7c1ddd031b4","subject":"Error contract","status":"open","region":"eu","participants":["qa-667fa3e7cfca","qa-2ead54f27f66"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.631358310Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-bbf0e5e8-103e-498c-89d9-36547c0df566

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d6c9ebcc-d89a-48bc-9b7a-f1e8944c213c
X-Correlation-Id: qa-bbf0e5e8-103e-498c-89d9-36547c0df566
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbf0e5e8-103e-498c-89d9-36547c0df566
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-bbf0e5e8-103e-498c-89d9-36547c0df566"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6a46ffbb-d1cb-4409-ad0f-215aee33d05c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a46ffbb-d1cb-4409-ad0f-215aee33d05c
Content-Type: application/json

--- request body ---
{"handle":"qa-2ead54f27f66","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a46ffbb-d1cb-4409-ad0f-215aee33d05c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c641cd08-5ed6-4a32-9a42-cfbef07ced79"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c45e102b-2b5c-441a-8780-5070b060b7b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c45e102b-2b5c-441a-8780-5070b060b7b4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c45e102b-2b5c-441a-8780-5070b060b7b4
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-9e6a59b0-ac8e-4f98-94eb-34ca6c6afab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e6a59b0-ac8e-4f98-94eb-34ca6c6afab7
Content-Type: application/json

--- request body ---
{"handle":"qa-2ead54f27f66","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e6a59b0-ac8e-4f98-94eb-34ca6c6afab7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9e6a59b0-ac8e-4f98-94eb-34ca6c6afab7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b285fca-f2a4-4100-ae8c-1cc3727908c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b285fca-f2a4-4100-ae8c-1cc3727908c9
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b285fca-f2a4-4100-ae8c-1cc3727908c9
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
correlation: qa-cf47ea7a-f873-4b5f-a11f-a77e6efa2988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf47ea7a-f873-4b5f-a11f-a77e6efa2988
Content-Type: application/json

--- request body ---
{"handle":"qa-667fa3e7cfca","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf47ea7a-f873-4b5f-a11f-a77e6efa2988
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf47ea7a-f873-4b5f-a11f-a77e6efa2988"}
```
