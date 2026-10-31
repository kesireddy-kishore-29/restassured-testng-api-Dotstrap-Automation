# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-4c54efbb-ccf8-4e80-b97e-ee15e97f5d2f` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-c7255b2f-d43d-4e45-a6f3-fec14f4d2c40` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-eaed83c8-eb2e-4726-a42f-fb013ded2353` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-1613a92f-4dc8-4223-828b-8adec762cd7c` |
| 5 | `PATCH /v1/accounts/me` | 400 | 29 | `qa-ece40a96-0633-4487-8128-9de7f2b8c9d0` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-4b5b82af-a2ba-41ad-a166-94df6527a83f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-1b080e24-2e3a-4358-a275-33054173a510` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-d41b0e1a-a39b-4133-b159-f0399556c1e7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-8c530778-d0f4-4dc2-8cb0-8ca81d5823d3` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-7063ecf7-2d96-458b-8876-aa1caf9dba93` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4c54efbb-ccf8-4e80-b97e-ee15e97f5d2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c54efbb-ccf8-4e80-b97e-ee15e97f5d2f
Content-Type: application/json

--- request body ---
{"handle":"qa-fd4e469745da","displayName":"QA fd4e469745da","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c54efbb-ccf8-4e80-b97e-ee15e97f5d2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Location: /v1/accounts/qa-fd4e469745da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a32027dc-b0d9-4afc-bd4f-5295ef62cd98","handle":"qa-fd4e469745da","displayName":"QA fd4e469745da","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.996157345Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c7255b2f-d43d-4e45-a6f3-fec14f4d2c40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7255b2f-d43d-4e45-a6f3-fec14f4d2c40
Content-Type: application/json

--- request body ---
{"handle":"qa-81eeb3bdb20a","displayName":"QA 81eeb3bdb20a","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7255b2f-d43d-4e45-a6f3-fec14f4d2c40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Location: /v1/accounts/qa-81eeb3bdb20a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4646dd49-68bb-4e95-8288-30e0496652fa","handle":"qa-81eeb3bdb20a","displayName":"QA 81eeb3bdb20a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.063517407Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eaed83c8-eb2e-4726-a42f-fb013ded2353

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaed83c8-eb2e-4726-a42f-fb013ded2353
Content-Type: application/json

--- request body ---
{"handle":"qa-fd4e469745da","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaed83c8-eb2e-4726-a42f-fb013ded2353
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a32027dc-b0d9-4afc-bd4f-5295ef62cd98"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1613a92f-4dc8-4223-828b-8adec762cd7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1613a92f-4dc8-4223-828b-8adec762cd7c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-81eeb3bdb20a","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1613a92f-4dc8-4223-828b-8adec762cd7c
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
Location: /v1/conversations/cnv_02d55048-4e32-4cca-a0d5-21bdca25d146
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_02d55048-4e32-4cca-a0d5-21bdca25d146","subject":"Error contract","status":"open","region":"eu","participants":["qa-fd4e469745da","qa-81eeb3bdb20a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.189731498Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-ece40a96-0633-4487-8128-9de7f2b8c9d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ece40a96-0633-4487-8128-9de7f2b8c9d0
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ece40a96-0633-4487-8128-9de7f2b8c9d0
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-ece40a96-0633-4487-8128-9de7f2b8c9d0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4b5b82af-a2ba-41ad-a166-94df6527a83f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b5b82af-a2ba-41ad-a166-94df6527a83f
Content-Type: application/json

--- request body ---
{"handle":"qa-81eeb3bdb20a","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b5b82af-a2ba-41ad-a166-94df6527a83f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4646dd49-68bb-4e95-8288-30e0496652fa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b080e24-2e3a-4358-a275-33054173a510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b080e24-2e3a-4358-a275-33054173a510
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b080e24-2e3a-4358-a275-33054173a510
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
correlation: qa-d41b0e1a-a39b-4133-b159-f0399556c1e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d41b0e1a-a39b-4133-b159-f0399556c1e7
Content-Type: application/json

--- request body ---
{"handle":"qa-81eeb3bdb20a","password":"****"}

--- response: 401 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d41b0e1a-a39b-4133-b159-f0399556c1e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d41b0e1a-a39b-4133-b159-f0399556c1e7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c530778-d0f4-4dc2-8cb0-8ca81d5823d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c530778-d0f4-4dc2-8cb0-8ca81d5823d3
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c530778-d0f4-4dc2-8cb0-8ca81d5823d3
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
correlation: qa-7063ecf7-2d96-458b-8876-aa1caf9dba93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7063ecf7-2d96-458b-8876-aa1caf9dba93
Content-Type: application/json

--- request body ---
{"handle":"qa-fd4e469745da","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7063ecf7-2d96-458b-8876-aa1caf9dba93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7063ecf7-2d96-458b-8876-aa1caf9dba93"}
```
