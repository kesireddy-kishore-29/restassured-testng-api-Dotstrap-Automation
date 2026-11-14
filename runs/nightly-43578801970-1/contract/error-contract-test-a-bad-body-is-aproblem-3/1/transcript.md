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
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-aeac80e9-2238-46d8-938f-5161c688c6d7` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-a1354ddc-10c5-416e-8d51-525e7a7ea786` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-16e4c31c-5f28-4912-8f1b-f64ee447fc8d` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-7443c60f-2482-4037-8006-7b8f1407fd00` |
| 5 | `POST /v1/accounts` | 400 | 30 | `qa-f825ca7f-9542-41d4-bc80-515c243df23a` |
| 6 | `POST /v1/auth/token` | 200 | 63 | `qa-ce022528-861e-431a-85df-95a2ca426d57` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-cb0775c1-c03a-43f0-88ab-eba8fe17300b` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-27e2bdc0-29a9-4e00-91be-3698f141be1f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-448e7f81-08df-4f72-b1c7-949f1b4eb23f` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-78b142e6-8c0f-4ced-b552-4a49decfa740` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aeac80e9-2238-46d8-938f-5161c688c6d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeac80e9-2238-46d8-938f-5161c688c6d7
Content-Type: application/json

--- request body ---
{"handle":"qa-66e3422961d9","displayName":"QA 66e3422961d9","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeac80e9-2238-46d8-938f-5161c688c6d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-66e3422961d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16217a96-73ca-43ae-ae3e-43a44e46c7d2","handle":"qa-66e3422961d9","displayName":"QA 66e3422961d9","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.993958544Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1354ddc-10c5-416e-8d51-525e7a7ea786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1354ddc-10c5-416e-8d51-525e7a7ea786
Content-Type: application/json

--- request body ---
{"handle":"qa-a9bdf5b63d0e","displayName":"QA a9bdf5b63d0e","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1354ddc-10c5-416e-8d51-525e7a7ea786
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Location: /v1/accounts/qa-a9bdf5b63d0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_98d43d4f-285f-43d0-ae67-df7562d3e8a7","handle":"qa-a9bdf5b63d0e","displayName":"QA a9bdf5b63d0e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.077507303Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-16e4c31c-5f28-4912-8f1b-f64ee447fc8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16e4c31c-5f28-4912-8f1b-f64ee447fc8d
Content-Type: application/json

--- request body ---
{"handle":"qa-66e3422961d9","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-16e4c31c-5f28-4912-8f1b-f64ee447fc8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16217a96-73ca-43ae-ae3e-43a44e46c7d2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7443c60f-2482-4037-8006-7b8f1407fd00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7443c60f-2482-4037-8006-7b8f1407fd00
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a9bdf5b63d0e","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-7443c60f-2482-4037-8006-7b8f1407fd00
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
Location: /v1/conversations/cnv_8f12a3f3-ec9d-4aa3-a644-a8763a6dfdf5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8f12a3f3-ec9d-4aa3-a644-a8763a6dfdf5","subject":"Error contract","status":"open","region":"eu","participants":["qa-66e3422961d9","qa-a9bdf5b63d0e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.155875743Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-f825ca7f-9542-41d4-bc80-515c243df23a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f825ca7f-9542-41d4-bc80-515c243df23a
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f825ca7f-9542-41d4-bc80-515c243df23a
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-f825ca7f-9542-41d4-bc80-515c243df23a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ce022528-861e-431a-85df-95a2ca426d57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce022528-861e-431a-85df-95a2ca426d57
Content-Type: application/json

--- request body ---
{"handle":"qa-a9bdf5b63d0e","password":"****"}

--- response: 200 in 63 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce022528-861e-431a-85df-95a2ca426d57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98d43d4f-285f-43d0-ae67-df7562d3e8a7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb0775c1-c03a-43f0-88ab-eba8fe17300b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb0775c1-c03a-43f0-88ab-eba8fe17300b
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb0775c1-c03a-43f0-88ab-eba8fe17300b
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
correlation: qa-27e2bdc0-29a9-4e00-91be-3698f141be1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27e2bdc0-29a9-4e00-91be-3698f141be1f
Content-Type: application/json

--- request body ---
{"handle":"qa-a9bdf5b63d0e","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27e2bdc0-29a9-4e00-91be-3698f141be1f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27e2bdc0-29a9-4e00-91be-3698f141be1f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-448e7f81-08df-4f72-b1c7-949f1b4eb23f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-448e7f81-08df-4f72-b1c7-949f1b4eb23f
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-448e7f81-08df-4f72-b1c7-949f1b4eb23f
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
correlation: qa-78b142e6-8c0f-4ced-b552-4a49decfa740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78b142e6-8c0f-4ced-b552-4a49decfa740
Content-Type: application/json

--- request body ---
{"handle":"qa-66e3422961d9","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78b142e6-8c0f-4ced-b552-4a49decfa740
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78b142e6-8c0f-4ced-b552-4a49decfa740"}
```
