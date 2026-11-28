# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-b53dc477-446d-4a3b-9339-3ec4b4f4c122` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-7d17e20b-a6a8-4512-aea5-4225f0c7bc19` |
| 3 | `GET /v1/conversations/{id}` | 404 | 9 | `qa-3050452c-e3bc-4d10-9b0f-bddaf2e1056f` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 6 | `qa-ace4389c-63c4-492f-bc71-f9629fb1eedc` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-11e351da-93eb-4edd-917c-748893c820fc` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-56791a95-e235-4730-8b0f-23d58bd08d67` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b53dc477-446d-4a3b-9339-3ec4b4f4c122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53dc477-446d-4a3b-9339-3ec4b4f4c122
Content-Type: application/json

--- request body ---
{"handle":"qa-a3c1740563c0","displayName":"QA a3c1740563c0","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b53dc477-446d-4a3b-9339-3ec4b4f4c122
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-a3c1740563c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b2dd470-fa01-4ec2-b343-c8e894240038","handle":"qa-a3c1740563c0","displayName":"QA a3c1740563c0","region":"eu","role":"user","createdAt":"2026-11-23T10:54:53.582466590Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7d17e20b-a6a8-4512-aea5-4225f0c7bc19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d17e20b-a6a8-4512-aea5-4225f0c7bc19
Content-Type: application/json

--- request body ---
{"handle":"qa-a3c1740563c0","password":"****"}

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d17e20b-a6a8-4512-aea5-4225f0c7bc19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b2dd470-fa01-4ec2-b343-c8e894240038"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-3050452c-e3bc-4d10-9b0f-bddaf2e1056f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3050452c-e3bc-4d10-9b0f-bddaf2e1056f
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3050452c-e3bc-4d10-9b0f-bddaf2e1056f
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-3050452c-e3bc-4d10-9b0f-bddaf2e1056f"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-ace4389c-63c4-492f-bc71-f9629fb1eedc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ace4389c-63c4-492f-bc71-f9629fb1eedc
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ace4389c-63c4-492f-bc71-f9629fb1eedc
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-ace4389c-63c4-492f-bc71-f9629fb1eedc"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11e351da-93eb-4edd-917c-748893c820fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11e351da-93eb-4edd-917c-748893c820fc
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11e351da-93eb-4edd-917c-748893c820fc
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-56791a95-e235-4730-8b0f-23d58bd08d67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56791a95-e235-4730-8b0f-23d58bd08d67
Content-Type: application/json

--- request body ---
{"handle":"qa-a3c1740563c0","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56791a95-e235-4730-8b0f-23d58bd08d67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56791a95-e235-4730-8b0f-23d58bd08d67"}
```
