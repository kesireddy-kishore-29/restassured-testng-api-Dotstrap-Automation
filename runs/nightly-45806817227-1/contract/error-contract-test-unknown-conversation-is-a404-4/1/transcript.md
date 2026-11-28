# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-e9846324-c094-4d17-941d-09d77ed7c029` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-a1102b35-67d1-42ba-b0f5-f7d00291d472` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 8 | `qa-dd07d8c2-004b-448c-82ef-0205ec5fa4ee` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-135afc40-bc41-40ae-ac95-cc9f45072811` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-df4696a6-4acf-4bb6-a9b1-c43a66dcff3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e9846324-c094-4d17-941d-09d77ed7c029

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9846324-c094-4d17-941d-09d77ed7c029
Content-Type: application/json

--- request body ---
{"handle":"qa-e1f470bf7767","displayName":"QA e1f470bf7767","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9846324-c094-4d17-941d-09d77ed7c029
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 5
Location: /v1/accounts/qa-e1f470bf7767
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f3691ca-a03e-4311-a3ba-d6edbd064048","handle":"qa-e1f470bf7767","displayName":"QA e1f470bf7767","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.477280019Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a1102b35-67d1-42ba-b0f5-f7d00291d472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1102b35-67d1-42ba-b0f5-f7d00291d472
Content-Type: application/json

--- request body ---
{"handle":"qa-e1f470bf7767","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1102b35-67d1-42ba-b0f5-f7d00291d472
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f3691ca-a03e-4311-a3ba-d6edbd064048"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-dd07d8c2-004b-448c-82ef-0205ec5fa4ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd07d8c2-004b-448c-82ef-0205ec5fa4ee
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd07d8c2-004b-448c-82ef-0205ec5fa4ee
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-dd07d8c2-004b-448c-82ef-0205ec5fa4ee"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-135afc40-bc41-40ae-ac95-cc9f45072811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-135afc40-bc41-40ae-ac95-cc9f45072811
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-135afc40-bc41-40ae-ac95-cc9f45072811
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-df4696a6-4acf-4bb6-a9b1-c43a66dcff3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df4696a6-4acf-4bb6-a9b1-c43a66dcff3a
Content-Type: application/json

--- request body ---
{"handle":"qa-e1f470bf7767","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df4696a6-4acf-4bb6-a9b1-c43a66dcff3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df4696a6-4acf-4bb6-a9b1-c43a66dcff3a"}
```
