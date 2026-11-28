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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-43cb45a0-4ec1-4c26-b389-4915b8c483c3` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-b370d129-90e4-445f-ac06-12b0e794e6aa` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-8a39cdd6-56bd-4abb-9f94-1e8c79fb81c0` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-943bcd7e-d8ad-42c7-bfd8-8882b4de7dc7` |
| 5 | `POST /v1/accounts` | 400 | 9 | `qa-7f9f3d2e-d468-488d-a8b8-183acd5a397b` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-f6402300-3dcd-4a15-886f-03ea9299e61e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-2244a698-8654-4d4f-88a1-5e5c92103a6d` |
| 8 | `POST /v1/auth/token` | 401 | 41 | `qa-7308955f-e917-4f89-9645-ce52679db5e7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-4f8e7311-a730-4143-859a-576ab48dcdf7` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-dca63f74-cb5a-417d-9e39-21a96a6599eb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43cb45a0-4ec1-4c26-b389-4915b8c483c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43cb45a0-4ec1-4c26-b389-4915b8c483c3
Content-Type: application/json

--- request body ---
{"handle":"qa-d77be26dfdea","displayName":"QA d77be26dfdea","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-43cb45a0-4ec1-4c26-b389-4915b8c483c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-d77be26dfdea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1d363b8-8790-4fd2-bc5f-8a523b9774be","handle":"qa-d77be26dfdea","displayName":"QA d77be26dfdea","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.141904183Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b370d129-90e4-445f-ac06-12b0e794e6aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b370d129-90e4-445f-ac06-12b0e794e6aa
Content-Type: application/json

--- request body ---
{"handle":"qa-f033565ec5ea","displayName":"QA f033565ec5ea","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-b370d129-90e4-445f-ac06-12b0e794e6aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Location: /v1/accounts/qa-f033565ec5ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a7c5da6-d861-4bc5-8d2a-1151cdc9b676","handle":"qa-f033565ec5ea","displayName":"QA f033565ec5ea","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.204333143Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8a39cdd6-56bd-4abb-9f94-1e8c79fb81c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a39cdd6-56bd-4abb-9f94-1e8c79fb81c0
Content-Type: application/json

--- request body ---
{"handle":"qa-d77be26dfdea","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a39cdd6-56bd-4abb-9f94-1e8c79fb81c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b1d363b8-8790-4fd2-bc5f-8a523b9774be"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-943bcd7e-d8ad-42c7-bfd8-8882b4de7dc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-943bcd7e-d8ad-42c7-bfd8-8882b4de7dc7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f033565ec5ea","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-943bcd7e-d8ad-42c7-bfd8-8882b4de7dc7
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
Location: /v1/conversations/cnv_9de70ba7-88ab-4cdf-a66b-327c4540799d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9de70ba7-88ab-4cdf-a66b-327c4540799d","subject":"Error contract","status":"open","region":"eu","participants":["qa-d77be26dfdea","qa-f033565ec5ea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.290422128Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-7f9f3d2e-d468-488d-a8b8-183acd5a397b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f9f3d2e-d468-488d-a8b8-183acd5a397b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f9f3d2e-d468-488d-a8b8-183acd5a397b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-7f9f3d2e-d468-488d-a8b8-183acd5a397b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f6402300-3dcd-4a15-886f-03ea9299e61e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6402300-3dcd-4a15-886f-03ea9299e61e
Content-Type: application/json

--- request body ---
{"handle":"qa-f033565ec5ea","password":"****"}

--- response: 200 in 46 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6402300-3dcd-4a15-886f-03ea9299e61e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a7c5da6-d861-4bc5-8d2a-1151cdc9b676"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2244a698-8654-4d4f-88a1-5e5c92103a6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2244a698-8654-4d4f-88a1-5e5c92103a6d
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2244a698-8654-4d4f-88a1-5e5c92103a6d
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
correlation: qa-7308955f-e917-4f89-9645-ce52679db5e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7308955f-e917-4f89-9645-ce52679db5e7
Content-Type: application/json

--- request body ---
{"handle":"qa-f033565ec5ea","password":"****"}

--- response: 401 in 41 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7308955f-e917-4f89-9645-ce52679db5e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7308955f-e917-4f89-9645-ce52679db5e7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f8e7311-a730-4143-859a-576ab48dcdf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f8e7311-a730-4143-859a-576ab48dcdf7
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f8e7311-a730-4143-859a-576ab48dcdf7
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
correlation: qa-dca63f74-cb5a-417d-9e39-21a96a6599eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dca63f74-cb5a-417d-9e39-21a96a6599eb
Content-Type: application/json

--- request body ---
{"handle":"qa-d77be26dfdea","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dca63f74-cb5a-417d-9e39-21a96a6599eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dca63f74-cb5a-417d-9e39-21a96a6599eb"}
```
