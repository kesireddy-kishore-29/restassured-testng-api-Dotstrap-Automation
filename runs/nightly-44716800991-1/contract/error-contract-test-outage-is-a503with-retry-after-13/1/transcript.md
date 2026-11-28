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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-9a27a148-898c-4e66-a011-8e5d50250771` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-a6837934-1023-4f6e-9309-a7f3869e0ccd` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-78f4138f-d182-44c6-8c7d-91f9bc339204` |
| 4 | `POST /v1/conversations` | 201 | 44 | `qa-f306b136-c9cd-4608-80b2-e0d66ffd52d3` |
| 5 | `GET /v1/credits/balance` | 503 | 18 | `qa-d600a121-f843-444c-abc3-d5b53c7a24a2` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-0b1259cc-b453-4b23-91c2-248d0849adef` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ddb910da-57dd-4238-8264-7f5975e735be` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-81e0576d-b8d4-41f0-b3a0-cf74a67bad3c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-b6e57a82-a372-4ee0-b2bc-de9779ba181b` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-04d600ce-5d23-4f11-b4d0-6de1095691be` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9a27a148-898c-4e66-a011-8e5d50250771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a27a148-898c-4e66-a011-8e5d50250771
Content-Type: application/json

--- request body ---
{"handle":"qa-9627b484af7d","displayName":"QA 9627b484af7d","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a27a148-898c-4e66-a011-8e5d50250771
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Location: /v1/accounts/qa-9627b484af7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb31603d-2bcd-45e2-9793-bffe05896125","handle":"qa-9627b484af7d","displayName":"QA 9627b484af7d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.218234226Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a6837934-1023-4f6e-9309-a7f3869e0ccd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6837934-1023-4f6e-9309-a7f3869e0ccd
Content-Type: application/json

--- request body ---
{"handle":"qa-6a849b21818d","displayName":"QA 6a849b21818d","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6837934-1023-4f6e-9309-a7f3869e0ccd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Location: /v1/accounts/qa-6a849b21818d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a943fbf-ff62-43bd-bcf6-ca9081fad231","handle":"qa-6a849b21818d","displayName":"QA 6a849b21818d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.266956983Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-78f4138f-d182-44c6-8c7d-91f9bc339204

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78f4138f-d182-44c6-8c7d-91f9bc339204
Content-Type: application/json

--- request body ---
{"handle":"qa-9627b484af7d","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-78f4138f-d182-44c6-8c7d-91f9bc339204
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb31603d-2bcd-45e2-9793-bffe05896125"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f306b136-c9cd-4608-80b2-e0d66ffd52d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f306b136-c9cd-4608-80b2-e0d66ffd52d3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6a849b21818d","subject":"Error contract","message":"Hi"}

--- response: 201 in 44 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f306b136-c9cd-4608-80b2-e0d66ffd52d3
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
Location: /v1/conversations/cnv_8cf484c3-38af-4b1a-9247-45a83377a38a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8cf484c3-38af-4b1a-9247-45a83377a38a","subject":"Error contract","status":"open","region":"eu","participants":["qa-9627b484af7d","qa-6a849b21818d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.375576533Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-d600a121-f843-444c-abc3-d5b53c7a24a2

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3c4f556d-6137-4e8c-bf86-97a1e67ef35c
X-Correlation-Id: qa-d600a121-f843-444c-abc3-d5b53c7a24a2
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d600a121-f843-444c-abc3-d5b53c7a24a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-d600a121-f843-444c-abc3-d5b53c7a24a2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0b1259cc-b453-4b23-91c2-248d0849adef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b1259cc-b453-4b23-91c2-248d0849adef
Content-Type: application/json

--- request body ---
{"handle":"qa-6a849b21818d","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b1259cc-b453-4b23-91c2-248d0849adef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a943fbf-ff62-43bd-bcf6-ca9081fad231"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ddb910da-57dd-4238-8264-7f5975e735be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddb910da-57dd-4238-8264-7f5975e735be
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ddb910da-57dd-4238-8264-7f5975e735be
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
correlation: qa-81e0576d-b8d4-41f0-b3a0-cf74a67bad3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81e0576d-b8d4-41f0-b3a0-cf74a67bad3c
Content-Type: application/json

--- request body ---
{"handle":"qa-6a849b21818d","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81e0576d-b8d4-41f0-b3a0-cf74a67bad3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81e0576d-b8d4-41f0-b3a0-cf74a67bad3c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6e57a82-a372-4ee0-b2bc-de9779ba181b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6e57a82-a372-4ee0-b2bc-de9779ba181b
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6e57a82-a372-4ee0-b2bc-de9779ba181b
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
correlation: qa-04d600ce-5d23-4f11-b4d0-6de1095691be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d600ce-5d23-4f11-b4d0-6de1095691be
Content-Type: application/json

--- request body ---
{"handle":"qa-9627b484af7d","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04d600ce-5d23-4f11-b4d0-6de1095691be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04d600ce-5d23-4f11-b4d0-6de1095691be"}
```
