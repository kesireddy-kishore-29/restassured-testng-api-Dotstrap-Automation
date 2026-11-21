# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-e94b811c-5015-4c5d-a938-7119ae947d11` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-b6fae466-73b5-421b-87ec-a70523f083e0` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-5bf19db1-c612-4a96-a037-a3f15150e661` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-5a59cbdf-52ad-4974-95a9-ae9ae63e6b68` |
| 5 | `POST /v1/accounts` | 415 | 15 | `qa-37b0d0d1-3be7-4ad3-98e8-c4fa1ef7f263` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-840ff5a1-feae-4443-a74b-ae2247a5d3a0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-686fcfb2-11c6-4633-8b90-e68a93a6334a` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-20e25ff4-4600-4462-90c3-bf7fecfc8825` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-322e2713-3465-4a12-8640-3c50fbc5b458` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-dbee355f-a4bc-4cd9-8baf-2536b40791b5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e94b811c-5015-4c5d-a938-7119ae947d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e94b811c-5015-4c5d-a938-7119ae947d11
Content-Type: application/json

--- request body ---
{"handle":"qa-9f10a435d225","displayName":"QA 9f10a435d225","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-e94b811c-5015-4c5d-a938-7119ae947d11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Location: /v1/accounts/qa-9f10a435d225
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f17dbc19-e3cb-442d-9a0f-21376bd2fc16","handle":"qa-9f10a435d225","displayName":"QA 9f10a435d225","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.872197380Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b6fae466-73b5-421b-87ec-a70523f083e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6fae466-73b5-421b-87ec-a70523f083e0
Content-Type: application/json

--- request body ---
{"handle":"qa-69bfbe5b6c17","displayName":"QA 69bfbe5b6c17","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6fae466-73b5-421b-87ec-a70523f083e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-69bfbe5b6c17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e694e2c7-af01-4859-acc2-1a1732201cf9","handle":"qa-69bfbe5b6c17","displayName":"QA 69bfbe5b6c17","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.911323861Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5bf19db1-c612-4a96-a037-a3f15150e661

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bf19db1-c612-4a96-a037-a3f15150e661
Content-Type: application/json

--- request body ---
{"handle":"qa-9f10a435d225","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bf19db1-c612-4a96-a037-a3f15150e661
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f17dbc19-e3cb-442d-9a0f-21376bd2fc16"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5a59cbdf-52ad-4974-95a9-ae9ae63e6b68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a59cbdf-52ad-4974-95a9-ae9ae63e6b68
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-69bfbe5b6c17","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a59cbdf-52ad-4974-95a9-ae9ae63e6b68
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
Location: /v1/conversations/cnv_32cb0994-bac1-47d1-9c55-8fc25810afb5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_32cb0994-bac1-47d1-9c55-8fc25810afb5","subject":"Error contract","status":"open","region":"eu","participants":["qa-9f10a435d225","qa-69bfbe5b6c17"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.005108902Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-37b0d0d1-3be7-4ad3-98e8-c4fa1ef7f263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37b0d0d1-3be7-4ad3-98e8-c4fa1ef7f263
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37b0d0d1-3be7-4ad3-98e8-c4fa1ef7f263
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-37b0d0d1-3be7-4ad3-98e8-c4fa1ef7f263"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-840ff5a1-feae-4443-a74b-ae2247a5d3a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-840ff5a1-feae-4443-a74b-ae2247a5d3a0
Content-Type: application/json

--- request body ---
{"handle":"qa-69bfbe5b6c17","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-840ff5a1-feae-4443-a74b-ae2247a5d3a0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e694e2c7-af01-4859-acc2-1a1732201cf9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-686fcfb2-11c6-4633-8b90-e68a93a6334a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-686fcfb2-11c6-4633-8b90-e68a93a6334a
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-686fcfb2-11c6-4633-8b90-e68a93a6334a
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
correlation: qa-20e25ff4-4600-4462-90c3-bf7fecfc8825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20e25ff4-4600-4462-90c3-bf7fecfc8825
Content-Type: application/json

--- request body ---
{"handle":"qa-69bfbe5b6c17","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20e25ff4-4600-4462-90c3-bf7fecfc8825
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-20e25ff4-4600-4462-90c3-bf7fecfc8825"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-322e2713-3465-4a12-8640-3c50fbc5b458

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-322e2713-3465-4a12-8640-3c50fbc5b458
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-322e2713-3465-4a12-8640-3c50fbc5b458
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
correlation: qa-dbee355f-a4bc-4cd9-8baf-2536b40791b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbee355f-a4bc-4cd9-8baf-2536b40791b5
Content-Type: application/json

--- request body ---
{"handle":"qa-9f10a435d225","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbee355f-a4bc-4cd9-8baf-2536b40791b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dbee355f-a4bc-4cd9-8baf-2536b40791b5"}
```
