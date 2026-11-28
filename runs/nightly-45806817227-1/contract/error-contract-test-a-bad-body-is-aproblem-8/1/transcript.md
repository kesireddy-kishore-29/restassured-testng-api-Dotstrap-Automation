# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-ac704ccd-bdaa-495c-b231-0fdad435ecbb` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-401c4ceb-bca9-43d5-bd58-bdf182f98c7b` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-4078c9c0-1c79-4b6a-a9d8-95c215d4544e` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-654253ab-47c7-43d3-8efa-fd11a5566dc1` |
| 5 | `PATCH /v1/accounts/me` | 422 | 27 | `qa-5d6ed374-9106-432d-b486-2c68384ac461` |
| 6 | `POST /v1/auth/token` | 200 | 76 | `qa-2924d6f6-8fcc-4248-80fa-21d9164ec6e1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-116bd0d6-2d63-4c44-824a-b2c6e9c2712d` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-59499b0e-cdd3-4be9-8f7b-818fd6902f52` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-e3023131-dd98-40f9-8a35-a4f7758a5d31` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-e133f54d-cb50-4bde-b476-ac4b8da357fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ac704ccd-bdaa-495c-b231-0fdad435ecbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac704ccd-bdaa-495c-b231-0fdad435ecbb
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6e665543ee","displayName":"QA 3e6e665543ee","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac704ccd-bdaa-495c-b231-0fdad435ecbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Location: /v1/accounts/qa-3e6e665543ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4251e38-baa7-4252-960d-f27fc8dc480d","handle":"qa-3e6e665543ee","displayName":"QA 3e6e665543ee","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.797700601Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-401c4ceb-bca9-43d5-bd58-bdf182f98c7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-401c4ceb-bca9-43d5-bd58-bdf182f98c7b
Content-Type: application/json

--- request body ---
{"handle":"qa-6a85cd65905f","displayName":"QA 6a85cd65905f","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-401c4ceb-bca9-43d5-bd58-bdf182f98c7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Location: /v1/accounts/qa-6a85cd65905f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ec1e9c0-7edd-43a7-8072-c182d87c8f29","handle":"qa-6a85cd65905f","displayName":"QA 6a85cd65905f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.840141923Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4078c9c0-1c79-4b6a-a9d8-95c215d4544e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4078c9c0-1c79-4b6a-a9d8-95c215d4544e
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6e665543ee","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4078c9c0-1c79-4b6a-a9d8-95c215d4544e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4251e38-baa7-4252-960d-f27fc8dc480d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-654253ab-47c7-43d3-8efa-fd11a5566dc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-654253ab-47c7-43d3-8efa-fd11a5566dc1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6a85cd65905f","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-654253ab-47c7-43d3-8efa-fd11a5566dc1
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
Location: /v1/conversations/cnv_d16fee4c-ecfb-43b5-96ea-d1a7a85f9a3e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d16fee4c-ecfb-43b5-96ea-d1a7a85f9a3e","subject":"Error contract","status":"open","region":"eu","participants":["qa-3e6e665543ee","qa-6a85cd65905f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.920311284Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-5d6ed374-9106-432d-b486-2c68384ac461

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d6ed374-9106-432d-b486-2c68384ac461
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d6ed374-9106-432d-b486-2c68384ac461
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-5d6ed374-9106-432d-b486-2c68384ac461","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2924d6f6-8fcc-4248-80fa-21d9164ec6e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2924d6f6-8fcc-4248-80fa-21d9164ec6e1
Content-Type: application/json

--- request body ---
{"handle":"qa-6a85cd65905f","password":"****"}

--- response: 200 in 76 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2924d6f6-8fcc-4248-80fa-21d9164ec6e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ec1e9c0-7edd-43a7-8072-c182d87c8f29"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-116bd0d6-2d63-4c44-824a-b2c6e9c2712d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-116bd0d6-2d63-4c44-824a-b2c6e9c2712d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-116bd0d6-2d63-4c44-824a-b2c6e9c2712d
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
correlation: qa-59499b0e-cdd3-4be9-8f7b-818fd6902f52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59499b0e-cdd3-4be9-8f7b-818fd6902f52
Content-Type: application/json

--- request body ---
{"handle":"qa-6a85cd65905f","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59499b0e-cdd3-4be9-8f7b-818fd6902f52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59499b0e-cdd3-4be9-8f7b-818fd6902f52"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3023131-dd98-40f9-8a35-a4f7758a5d31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3023131-dd98-40f9-8a35-a4f7758a5d31
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3023131-dd98-40f9-8a35-a4f7758a5d31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e133f54d-cb50-4bde-b476-ac4b8da357fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e133f54d-cb50-4bde-b476-ac4b8da357fe
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6e665543ee","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e133f54d-cb50-4bde-b476-ac4b8da357fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e133f54d-cb50-4bde-b476-ac4b8da357fe"}
```
