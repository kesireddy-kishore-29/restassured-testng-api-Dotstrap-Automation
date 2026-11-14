# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-ecbc8d23-233d-418b-a694-88b94bf55aa2` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-7368c2d1-72c9-4aa2-bb6d-98e4f0b9b7c8` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-db715d94-c99e-45fe-9f4f-deeac9ed4b19` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-aa926ddc-1889-40fa-96c0-976f312dc17d` |
| 5 | `GET /v1/admin/stats` | 503 | 23 | `qa-e196996b-40de-446f-81d2-b6a14c0f2d28` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-42a351fa-af13-4ac6-8a7f-196d125dcb72` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0c4cdf41-cdf9-48ac-8b71-b05981113e0d` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-e9105c85-27bc-4799-a955-e3362df8a87d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6e064fb5-c3b9-4399-9a07-1d3074401d11` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-b9d40069-b8e3-48ed-bccf-170f67f944fc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ecbc8d23-233d-418b-a694-88b94bf55aa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecbc8d23-233d-418b-a694-88b94bf55aa2
Content-Type: application/json

--- request body ---
{"handle":"qa-39d233f0e406","displayName":"QA 39d233f0e406","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecbc8d23-233d-418b-a694-88b94bf55aa2
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
Location: /v1/accounts/qa-39d233f0e406
X-Served-Region: eu
Content-Length: 181

{"id":"acc_171eccd7-5ba7-4e40-b929-bb557aa531bc","handle":"qa-39d233f0e406","displayName":"QA 39d233f0e406","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.997146666Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7368c2d1-72c9-4aa2-bb6d-98e4f0b9b7c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7368c2d1-72c9-4aa2-bb6d-98e4f0b9b7c8
Content-Type: application/json

--- request body ---
{"handle":"qa-aec25bf5397b","displayName":"QA aec25bf5397b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7368c2d1-72c9-4aa2-bb6d-98e4f0b9b7c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Location: /v1/accounts/qa-aec25bf5397b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b86eb82-ac04-4140-aafe-9409c233b61b","handle":"qa-aec25bf5397b","displayName":"QA aec25bf5397b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.044579101Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-db715d94-c99e-45fe-9f4f-deeac9ed4b19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db715d94-c99e-45fe-9f4f-deeac9ed4b19
Content-Type: application/json

--- request body ---
{"handle":"qa-39d233f0e406","password":"****"}

--- response: 200 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-db715d94-c99e-45fe-9f4f-deeac9ed4b19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_171eccd7-5ba7-4e40-b929-bb557aa531bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aa926ddc-1889-40fa-96c0-976f312dc17d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa926ddc-1889-40fa-96c0-976f312dc17d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aec25bf5397b","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa926ddc-1889-40fa-96c0-976f312dc17d
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
Location: /v1/conversations/cnv_184e91ea-731b-414b-a442-cf76b1166d14
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_184e91ea-731b-414b-a442-cf76b1166d14","subject":"Error contract","status":"open","region":"eu","participants":["qa-39d233f0e406","qa-aec25bf5397b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.132927477Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-e196996b-40de-446f-81d2-b6a14c0f2d28

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6c708bbf-e97f-4539-8d9b-5781545d9420
X-Correlation-Id: qa-e196996b-40de-446f-81d2-b6a14c0f2d28
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e196996b-40de-446f-81d2-b6a14c0f2d28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-e196996b-40de-446f-81d2-b6a14c0f2d28"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-42a351fa-af13-4ac6-8a7f-196d125dcb72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42a351fa-af13-4ac6-8a7f-196d125dcb72
Content-Type: application/json

--- request body ---
{"handle":"qa-aec25bf5397b","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-42a351fa-af13-4ac6-8a7f-196d125dcb72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b86eb82-ac04-4140-aafe-9409c233b61b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c4cdf41-cdf9-48ac-8b71-b05981113e0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c4cdf41-cdf9-48ac-8b71-b05981113e0d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c4cdf41-cdf9-48ac-8b71-b05981113e0d
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
correlation: qa-e9105c85-27bc-4799-a955-e3362df8a87d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9105c85-27bc-4799-a955-e3362df8a87d
Content-Type: application/json

--- request body ---
{"handle":"qa-aec25bf5397b","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9105c85-27bc-4799-a955-e3362df8a87d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9105c85-27bc-4799-a955-e3362df8a87d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e064fb5-c3b9-4399-9a07-1d3074401d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e064fb5-c3b9-4399-9a07-1d3074401d11
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e064fb5-c3b9-4399-9a07-1d3074401d11
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
correlation: qa-b9d40069-b8e3-48ed-bccf-170f67f944fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d40069-b8e3-48ed-bccf-170f67f944fc
Content-Type: application/json

--- request body ---
{"handle":"qa-39d233f0e406","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9d40069-b8e3-48ed-bccf-170f67f944fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9d40069-b8e3-48ed-bccf-170f67f944fc"}
```
