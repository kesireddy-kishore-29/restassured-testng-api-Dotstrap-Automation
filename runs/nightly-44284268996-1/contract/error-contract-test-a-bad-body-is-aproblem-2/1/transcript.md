# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-671754e8-2fdb-4dc6-ad4b-173b802f5467` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-5ed948e2-c81a-4cec-8918-deaa799df43f` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-01a679af-45a9-4e80-bb65-9258cfdfe52f` |
| 4 | `POST /v1/conversations` | 201 | 37 | `qa-52564419-69f8-4331-af91-24a198dab6c6` |
| 5 | `POST /v1/auth/token` | 422 | 37 | `qa-a6f43387-2f85-4439-89bf-a712c5e0b73d` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-1f158672-ed71-4b9f-842c-a440a76955c3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ce20a0c0-d8ac-4e0d-8fae-095f9e69289b` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-58b405f7-f4e8-48a4-953c-2afeec6f72c8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c5916fb9-fcb2-436e-af13-17401ef26705` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-6b004349-12dd-4370-899b-ee64d22eb7ba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-671754e8-2fdb-4dc6-ad4b-173b802f5467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-671754e8-2fdb-4dc6-ad4b-173b802f5467
Content-Type: application/json

--- request body ---
{"handle":"qa-19d8e9cfd439","displayName":"QA 19d8e9cfd439","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-671754e8-2fdb-4dc6-ad4b-173b802f5467
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
Location: /v1/accounts/qa-19d8e9cfd439
X-Served-Region: eu
Content-Length: 181

{"id":"acc_632150da-2c1f-4ca7-a11a-be0177f3e87c","handle":"qa-19d8e9cfd439","displayName":"QA 19d8e9cfd439","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.516366146Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5ed948e2-c81a-4cec-8918-deaa799df43f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ed948e2-c81a-4cec-8918-deaa799df43f
Content-Type: application/json

--- request body ---
{"handle":"qa-5dc3e2013995","displayName":"QA 5dc3e2013995","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ed948e2-c81a-4cec-8918-deaa799df43f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-5dc3e2013995
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8dd231a-66c0-4945-a4fa-71ef1465aa2a","handle":"qa-5dc3e2013995","displayName":"QA 5dc3e2013995","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.543775760Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-01a679af-45a9-4e80-bb65-9258cfdfe52f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01a679af-45a9-4e80-bb65-9258cfdfe52f
Content-Type: application/json

--- request body ---
{"handle":"qa-19d8e9cfd439","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-01a679af-45a9-4e80-bb65-9258cfdfe52f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_632150da-2c1f-4ca7-a11a-be0177f3e87c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-52564419-69f8-4331-af91-24a198dab6c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52564419-69f8-4331-af91-24a198dab6c6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5dc3e2013995","subject":"Error contract","message":"Hi"}

--- response: 201 in 37 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-52564419-69f8-4331-af91-24a198dab6c6
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
Location: /v1/conversations/cnv_e9a54938-9906-4894-afac-f2af84ea6131
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e9a54938-9906-4894-afac-f2af84ea6131","subject":"Error contract","status":"open","region":"eu","participants":["qa-19d8e9cfd439","qa-5dc3e2013995"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.624212316Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a6f43387-2f85-4439-89bf-a712c5e0b73d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6f43387-2f85-4439-89bf-a712c5e0b73d
Content-Type: application/json

--- request body ---
{"handle":"qa-19d8e9cfd439","password":"****","ttlSeconds":0}

--- response: 422 in 37 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6f43387-2f85-4439-89bf-a712c5e0b73d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-a6f43387-2f85-4439-89bf-a712c5e0b73d","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1f158672-ed71-4b9f-842c-a440a76955c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f158672-ed71-4b9f-842c-a440a76955c3
Content-Type: application/json

--- request body ---
{"handle":"qa-5dc3e2013995","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f158672-ed71-4b9f-842c-a440a76955c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8dd231a-66c0-4945-a4fa-71ef1465aa2a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce20a0c0-d8ac-4e0d-8fae-095f9e69289b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce20a0c0-d8ac-4e0d-8fae-095f9e69289b
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce20a0c0-d8ac-4e0d-8fae-095f9e69289b
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
correlation: qa-58b405f7-f4e8-48a4-953c-2afeec6f72c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b405f7-f4e8-48a4-953c-2afeec6f72c8
Content-Type: application/json

--- request body ---
{"handle":"qa-5dc3e2013995","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58b405f7-f4e8-48a4-953c-2afeec6f72c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58b405f7-f4e8-48a4-953c-2afeec6f72c8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5916fb9-fcb2-436e-af13-17401ef26705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5916fb9-fcb2-436e-af13-17401ef26705
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5916fb9-fcb2-436e-af13-17401ef26705
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
correlation: qa-6b004349-12dd-4370-899b-ee64d22eb7ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b004349-12dd-4370-899b-ee64d22eb7ba
Content-Type: application/json

--- request body ---
{"handle":"qa-19d8e9cfd439","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b004349-12dd-4370-899b-ee64d22eb7ba
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b004349-12dd-4370-899b-ee64d22eb7ba"}
```
