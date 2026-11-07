# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 66 | `qa-7bfa57fb-b9c8-4679-9804-ee72a781f5ae` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-426bc319-6b4b-4ea5-8a65-064a1c4d3189` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-037577f8-75c3-4424-b23c-b84af07f4bde` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-5f24a60f-610c-46ae-bd0f-b1f6f2a7552e` |
| 5 | `POST /v1/conversations` | 503 | 24 | `qa-4798e420-30e2-4cf2-93ef-189e3320e6ac` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-32bd244b-9b46-4b8a-8717-16369c1d46ee` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-b79dafc4-0d30-4ef5-adf6-2aa8a109426e` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-4fe4445a-6cef-40c0-8854-ab2a0f5a03f0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-1b585419-2f9e-488d-88d0-990463ca207b` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-51335410-e774-497c-aefc-dfbdca040a01` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7bfa57fb-b9c8-4679-9804-ee72a781f5ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bfa57fb-b9c8-4679-9804-ee72a781f5ae
Content-Type: application/json

--- request body ---
{"handle":"qa-b864d858fa0e","displayName":"QA b864d858fa0e","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bfa57fb-b9c8-4679-9804-ee72a781f5ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-b864d858fa0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7e877ab-77ba-40a9-a1a6-cd25cc8b9e9b","handle":"qa-b864d858fa0e","displayName":"QA b864d858fa0e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.017324033Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-426bc319-6b4b-4ea5-8a65-064a1c4d3189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-426bc319-6b4b-4ea5-8a65-064a1c4d3189
Content-Type: application/json

--- request body ---
{"handle":"qa-6b4776f22003","displayName":"QA 6b4776f22003","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-426bc319-6b4b-4ea5-8a65-064a1c4d3189
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 7
Location: /v1/accounts/qa-6b4776f22003
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b508e8c7-579e-42b2-bd24-3853252888d5","handle":"qa-6b4776f22003","displayName":"QA 6b4776f22003","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.076042129Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-037577f8-75c3-4424-b23c-b84af07f4bde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-037577f8-75c3-4424-b23c-b84af07f4bde
Content-Type: application/json

--- request body ---
{"handle":"qa-b864d858fa0e","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-037577f8-75c3-4424-b23c-b84af07f4bde
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7e877ab-77ba-40a9-a1a6-cd25cc8b9e9b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5f24a60f-610c-46ae-bd0f-b1f6f2a7552e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f24a60f-610c-46ae-bd0f-b1f6f2a7552e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6b4776f22003","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f24a60f-610c-46ae-bd0f-b1f6f2a7552e
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
Location: /v1/conversations/cnv_9cef4efe-2ebf-4fc6-af11-a23b244ec66e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9cef4efe-2ebf-4fc6-af11-a23b244ec66e","subject":"Error contract","status":"open","region":"eu","participants":["qa-b864d858fa0e","qa-6b4776f22003"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.170166809Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4798e420-30e2-4cf2-93ef-189e3320e6ac

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c95d8625-4ab4-4fe0-b2fd-9d46aed96118
X-Correlation-Id: qa-4798e420-30e2-4cf2-93ef-189e3320e6ac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b864d858fa0e","subject":"Probe","message":"Hi"}

--- response: 503 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4798e420-30e2-4cf2-93ef-189e3320e6ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-4798e420-30e2-4cf2-93ef-189e3320e6ac"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-32bd244b-9b46-4b8a-8717-16369c1d46ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32bd244b-9b46-4b8a-8717-16369c1d46ee
Content-Type: application/json

--- request body ---
{"handle":"qa-6b4776f22003","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-32bd244b-9b46-4b8a-8717-16369c1d46ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b508e8c7-579e-42b2-bd24-3853252888d5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b79dafc4-0d30-4ef5-adf6-2aa8a109426e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b79dafc4-0d30-4ef5-adf6-2aa8a109426e
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b79dafc4-0d30-4ef5-adf6-2aa8a109426e
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
correlation: qa-4fe4445a-6cef-40c0-8854-ab2a0f5a03f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fe4445a-6cef-40c0-8854-ab2a0f5a03f0
Content-Type: application/json

--- request body ---
{"handle":"qa-6b4776f22003","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fe4445a-6cef-40c0-8854-ab2a0f5a03f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4fe4445a-6cef-40c0-8854-ab2a0f5a03f0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b585419-2f9e-488d-88d0-990463ca207b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b585419-2f9e-488d-88d0-990463ca207b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b585419-2f9e-488d-88d0-990463ca207b
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
correlation: qa-51335410-e774-497c-aefc-dfbdca040a01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51335410-e774-497c-aefc-dfbdca040a01
Content-Type: application/json

--- request body ---
{"handle":"qa-b864d858fa0e","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51335410-e774-497c-aefc-dfbdca040a01
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51335410-e774-497c-aefc-dfbdca040a01"}
```
