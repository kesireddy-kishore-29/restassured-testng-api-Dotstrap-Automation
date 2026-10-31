# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 450 | `qa-b4885e6f-7dbc-43bb-b9af-da6d56316522` |
| 2 | `POST /v1/accounts` | 201 | 64 | `qa-e38f1540-614a-44b4-baf3-904bb41fd495` |
| 3 | `POST /v1/auth/token` | 200 | 74 | `qa-1c60e205-7ba2-427a-97db-246161adf1b9` |
| 4 | `POST /v1/conversations` | 201 | 93 | `qa-1a9d0b92-3c5e-436f-bfe0-d16670212946` |
| 5 | `POST /v1/accounts` | 400 | 18 | `qa-f141363f-5447-42be-a613-41da6a4ad803` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-e78c192b-7165-46e2-8f28-f58432caf96a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-83e20714-da6a-41a3-98c9-a9227e2e3f09` |
| 8 | `POST /v1/auth/token` | 401 | 59 | `qa-1c14622a-afd9-40dd-8f36-3555601d3c57` |
| 9 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-0471a68b-1216-41a7-9d2f-d42b216cbf81` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-499624b7-2ebe-402b-a5c5-6893ed918caf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b4885e6f-7dbc-43bb-b9af-da6d56316522

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4885e6f-7dbc-43bb-b9af-da6d56316522
Content-Type: application/json

--- request body ---
{"handle":"qa-df9d4db06c4f","displayName":"QA df9d4db06c4f","password":"****","region":"eu"}

--- response: 201 in 450 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4885e6f-7dbc-43bb-b9af-da6d56316522
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Location: /v1/accounts/qa-df9d4db06c4f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ead1061d-224a-4223-be52-2e1cece89c00","handle":"qa-df9d4db06c4f","displayName":"QA df9d4db06c4f","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.372633923Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e38f1540-614a-44b4-baf3-904bb41fd495

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e38f1540-614a-44b4-baf3-904bb41fd495
Content-Type: application/json

--- request body ---
{"handle":"qa-1ed0af30d145","displayName":"QA 1ed0af30d145","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e38f1540-614a-44b4-baf3-904bb41fd495
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-1ed0af30d145
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4bab73d9-5494-4cee-ad67-a50ca9a7e9e2","handle":"qa-1ed0af30d145","displayName":"QA 1ed0af30d145","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.843579988Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c60e205-7ba2-427a-97db-246161adf1b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c60e205-7ba2-427a-97db-246161adf1b9
Content-Type: application/json

--- request body ---
{"handle":"qa-df9d4db06c4f","password":"****"}

--- response: 200 in 74 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c60e205-7ba2-427a-97db-246161adf1b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ead1061d-224a-4223-be52-2e1cece89c00"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1a9d0b92-3c5e-436f-bfe0-d16670212946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a9d0b92-3c5e-436f-bfe0-d16670212946
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ed0af30d145","subject":"Error contract","message":"Hi"}

--- response: 201 in 93 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a9d0b92-3c5e-436f-bfe0-d16670212946
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
Location: /v1/conversations/cnv_587ca719-250d-43ed-8bf5-b59a1fa10cdc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_587ca719-250d-43ed-8bf5-b59a1fa10cdc","subject":"Error contract","status":"open","region":"eu","participants":["qa-df9d4db06c4f","qa-1ed0af30d145"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.200650710Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-f141363f-5447-42be-a613-41da6a4ad803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f141363f-5447-42be-a613-41da6a4ad803
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f141363f-5447-42be-a613-41da6a4ad803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-f141363f-5447-42be-a613-41da6a4ad803"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e78c192b-7165-46e2-8f28-f58432caf96a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78c192b-7165-46e2-8f28-f58432caf96a
Content-Type: application/json

--- request body ---
{"handle":"qa-1ed0af30d145","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e78c192b-7165-46e2-8f28-f58432caf96a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4bab73d9-5494-4cee-ad67-a50ca9a7e9e2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83e20714-da6a-41a3-98c9-a9227e2e3f09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83e20714-da6a-41a3-98c9-a9227e2e3f09
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83e20714-da6a-41a3-98c9-a9227e2e3f09
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
correlation: qa-1c14622a-afd9-40dd-8f36-3555601d3c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c14622a-afd9-40dd-8f36-3555601d3c57
Content-Type: application/json

--- request body ---
{"handle":"qa-1ed0af30d145","password":"****"}

--- response: 401 in 59 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c14622a-afd9-40dd-8f36-3555601d3c57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c14622a-afd9-40dd-8f36-3555601d3c57"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0471a68b-1216-41a7-9d2f-d42b216cbf81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0471a68b-1216-41a7-9d2f-d42b216cbf81
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0471a68b-1216-41a7-9d2f-d42b216cbf81
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-499624b7-2ebe-402b-a5c5-6893ed918caf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-499624b7-2ebe-402b-a5c5-6893ed918caf
Content-Type: application/json

--- request body ---
{"handle":"qa-df9d4db06c4f","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-499624b7-2ebe-402b-a5c5-6893ed918caf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-499624b7-2ebe-402b-a5c5-6893ed918caf"}
```
