# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-d59364cd-0602-4b42-98ad-3d6729985cd8` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-648154ec-b69a-4d59-a11d-c0b1dacc1f80` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-914ea8bd-58f4-4f27-ac1a-3bc86b031c73` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-e5f4b023-d237-47f3-83eb-4d57a98e7723` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 16 | `qa-bb9b1e1b-29f1-4f39-81ec-fd36808d25ec` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-ba179dff-81cd-48a7-b85a-b4dbed03a2f7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-7ff2a239-f5fc-483a-9b05-3070e60926d0` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-e77e26d6-9488-4869-9995-d0d4dc30b534` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-2cd2176d-bd56-4479-92b4-c1b021f75970` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-1b028347-0d94-496e-a301-7029261564b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d59364cd-0602-4b42-98ad-3d6729985cd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d59364cd-0602-4b42-98ad-3d6729985cd8
Content-Type: application/json

--- request body ---
{"handle":"qa-37821ec2154d","displayName":"QA 37821ec2154d","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d59364cd-0602-4b42-98ad-3d6729985cd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-37821ec2154d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18fa28a5-540e-4acd-8a5e-87933b70347a","handle":"qa-37821ec2154d","displayName":"QA 37821ec2154d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.815762404Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-648154ec-b69a-4d59-a11d-c0b1dacc1f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-648154ec-b69a-4d59-a11d-c0b1dacc1f80
Content-Type: application/json

--- request body ---
{"handle":"qa-ff6af53d973a","displayName":"QA ff6af53d973a","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-648154ec-b69a-4d59-a11d-c0b1dacc1f80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 7
Location: /v1/accounts/qa-ff6af53d973a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3963628-71b1-4113-b328-422692758832","handle":"qa-ff6af53d973a","displayName":"QA ff6af53d973a","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.931786330Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-914ea8bd-58f4-4f27-ac1a-3bc86b031c73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-914ea8bd-58f4-4f27-ac1a-3bc86b031c73
Content-Type: application/json

--- request body ---
{"handle":"qa-37821ec2154d","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-914ea8bd-58f4-4f27-ac1a-3bc86b031c73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18fa28a5-540e-4acd-8a5e-87933b70347a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e5f4b023-d237-47f3-83eb-4d57a98e7723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5f4b023-d237-47f3-83eb-4d57a98e7723
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ff6af53d973a","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5f4b023-d237-47f3-83eb-4d57a98e7723
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
Location: /v1/conversations/cnv_3404d8c2-145e-4913-b97f-004f30f5fa08
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3404d8c2-145e-4913-b97f-004f30f5fa08","subject":"Error contract","status":"open","region":"eu","participants":["qa-37821ec2154d","qa-ff6af53d973a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.049961702Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-37821ec2154d
correlation: qa-bb9b1e1b-29f1-4f39-81ec-fd36808d25ec

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9ac42b5f-9416-42af-8cc7-648feaaa533b
X-Correlation-Id: qa-bb9b1e1b-29f1-4f39-81ec-fd36808d25ec
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb9b1e1b-29f1-4f39-81ec-fd36808d25ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-37821ec2154d","correlationId":"qa-bb9b1e1b-29f1-4f39-81ec-fd36808d25ec"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ba179dff-81cd-48a7-b85a-b4dbed03a2f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba179dff-81cd-48a7-b85a-b4dbed03a2f7
Content-Type: application/json

--- request body ---
{"handle":"qa-ff6af53d973a","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba179dff-81cd-48a7-b85a-b4dbed03a2f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3963628-71b1-4113-b328-422692758832"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ff2a239-f5fc-483a-9b05-3070e60926d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ff2a239-f5fc-483a-9b05-3070e60926d0
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ff2a239-f5fc-483a-9b05-3070e60926d0
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
correlation: qa-e77e26d6-9488-4869-9995-d0d4dc30b534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e77e26d6-9488-4869-9995-d0d4dc30b534
Content-Type: application/json

--- request body ---
{"handle":"qa-ff6af53d973a","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e77e26d6-9488-4869-9995-d0d4dc30b534
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e77e26d6-9488-4869-9995-d0d4dc30b534"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2cd2176d-bd56-4479-92b4-c1b021f75970

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cd2176d-bd56-4479-92b4-c1b021f75970
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2cd2176d-bd56-4479-92b4-c1b021f75970
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
correlation: qa-1b028347-0d94-496e-a301-7029261564b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b028347-0d94-496e-a301-7029261564b9
Content-Type: application/json

--- request body ---
{"handle":"qa-37821ec2154d","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b028347-0d94-496e-a301-7029261564b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b028347-0d94-496e-a301-7029261564b9"}
```
