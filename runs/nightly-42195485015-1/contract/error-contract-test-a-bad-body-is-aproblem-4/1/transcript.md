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
| 1 | `POST /v1/accounts` | 201 | 72 | `qa-5eb2f03c-e77e-4e4d-a581-6e8b4428a8a1` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-2019639d-bdcc-45b1-9b28-b6818d606c6d` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-00510382-f20a-410f-8a8a-479f13faf994` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-b26ffdc9-c174-4227-87e5-e4adca1e38fa` |
| 5 | `POST /v1/accounts` | 415 | 24 | `qa-ed3a43cd-6a12-4858-a2a5-60ae83b692fe` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-bbb1833b-adb3-406d-aec9-ae332e60998a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-bd61c633-820d-4415-a22a-6fb55eb0eea2` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-e7d9fead-6390-4ba4-9c22-bf27f76fcffe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-a537425d-167e-4a13-a150-205c9c004fa6` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-78479af9-64e0-492c-b294-affc4db622cd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5eb2f03c-e77e-4e4d-a581-6e8b4428a8a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eb2f03c-e77e-4e4d-a581-6e8b4428a8a1
Content-Type: application/json

--- request body ---
{"handle":"qa-4099a6143003","displayName":"QA 4099a6143003","password":"****","region":"eu"}

--- response: 201 in 72 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5eb2f03c-e77e-4e4d-a581-6e8b4428a8a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-4099a6143003
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5a43447d-47d3-4e01-8eb8-5ec0a08fa2e2","handle":"qa-4099a6143003","displayName":"QA 4099a6143003","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.944754815Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2019639d-bdcc-45b1-9b28-b6818d606c6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2019639d-bdcc-45b1-9b28-b6818d606c6d
Content-Type: application/json

--- request body ---
{"handle":"qa-62e0b4385f6d","displayName":"QA 62e0b4385f6d","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2019639d-bdcc-45b1-9b28-b6818d606c6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 7
Location: /v1/accounts/qa-62e0b4385f6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab2a1f07-758e-4589-81c4-f07cc9c333f4","handle":"qa-62e0b4385f6d","displayName":"QA 62e0b4385f6d","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.042216388Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-00510382-f20a-410f-8a8a-479f13faf994

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00510382-f20a-410f-8a8a-479f13faf994
Content-Type: application/json

--- request body ---
{"handle":"qa-4099a6143003","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-00510382-f20a-410f-8a8a-479f13faf994
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5a43447d-47d3-4e01-8eb8-5ec0a08fa2e2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b26ffdc9-c174-4227-87e5-e4adca1e38fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b26ffdc9-c174-4227-87e5-e4adca1e38fa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-62e0b4385f6d","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b26ffdc9-c174-4227-87e5-e4adca1e38fa
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
Location: /v1/conversations/cnv_5a7f3ec7-7148-4a69-a903-2321dc06cd47
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a7f3ec7-7148-4a69-a903-2321dc06cd47","subject":"Error contract","status":"open","region":"eu","participants":["qa-4099a6143003","qa-62e0b4385f6d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.137503381Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-ed3a43cd-6a12-4858-a2a5-60ae83b692fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed3a43cd-6a12-4858-a2a5-60ae83b692fe
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed3a43cd-6a12-4858-a2a5-60ae83b692fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-ed3a43cd-6a12-4858-a2a5-60ae83b692fe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bbb1833b-adb3-406d-aec9-ae332e60998a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbb1833b-adb3-406d-aec9-ae332e60998a
Content-Type: application/json

--- request body ---
{"handle":"qa-62e0b4385f6d","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbb1833b-adb3-406d-aec9-ae332e60998a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab2a1f07-758e-4589-81c4-f07cc9c333f4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd61c633-820d-4415-a22a-6fb55eb0eea2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd61c633-820d-4415-a22a-6fb55eb0eea2
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd61c633-820d-4415-a22a-6fb55eb0eea2
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
correlation: qa-e7d9fead-6390-4ba4-9c22-bf27f76fcffe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7d9fead-6390-4ba4-9c22-bf27f76fcffe
Content-Type: application/json

--- request body ---
{"handle":"qa-62e0b4385f6d","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7d9fead-6390-4ba4-9c22-bf27f76fcffe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7d9fead-6390-4ba4-9c22-bf27f76fcffe"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a537425d-167e-4a13-a150-205c9c004fa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a537425d-167e-4a13-a150-205c9c004fa6
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a537425d-167e-4a13-a150-205c9c004fa6
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
correlation: qa-78479af9-64e0-492c-b294-affc4db622cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78479af9-64e0-492c-b294-affc4db622cd
Content-Type: application/json

--- request body ---
{"handle":"qa-4099a6143003","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78479af9-64e0-492c-b294-affc4db622cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78479af9-64e0-492c-b294-affc4db622cd"}
```
