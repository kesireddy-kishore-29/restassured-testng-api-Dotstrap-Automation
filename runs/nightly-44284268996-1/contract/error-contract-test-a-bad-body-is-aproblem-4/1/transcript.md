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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-fd62f08b-5cbb-4009-bb2e-62fa3d744217` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-47488f7d-b53e-496c-9f95-de21df95557d` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-595ae42f-9ccc-4c41-8565-08fc684608ae` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-770be2c9-3c04-4ddb-bfff-0476dd309471` |
| 5 | `POST /v1/accounts` | 415 | 16 | `qa-7d987c59-affb-4ae6-a462-7f62ea53f70d` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-66ada72c-45fa-4660-8016-85a1c4372dea` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-0327ff8d-4428-4301-991a-0dfa23d5ea66` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-14af49cd-5b3f-46d4-aca3-509a92457fae` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-98e3de4f-1c52-4709-b11b-baab4d5baeba` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-a18d8df4-5fc4-4cfc-84ef-aa009b110109` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd62f08b-5cbb-4009-bb2e-62fa3d744217

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd62f08b-5cbb-4009-bb2e-62fa3d744217
Content-Type: application/json

--- request body ---
{"handle":"qa-894141e83849","displayName":"QA 894141e83849","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd62f08b-5cbb-4009-bb2e-62fa3d744217
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Location: /v1/accounts/qa-894141e83849
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f0b22c1-82df-4d76-8fcf-eb01e9a4724d","handle":"qa-894141e83849","displayName":"QA 894141e83849","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.677612174Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-47488f7d-b53e-496c-9f95-de21df95557d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47488f7d-b53e-496c-9f95-de21df95557d
Content-Type: application/json

--- request body ---
{"handle":"qa-227953bc8111","displayName":"QA 227953bc8111","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-47488f7d-b53e-496c-9f95-de21df95557d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-227953bc8111
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d83ccac-891a-4b8b-8624-91ea16d6e398","handle":"qa-227953bc8111","displayName":"QA 227953bc8111","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.732149922Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-595ae42f-9ccc-4c41-8565-08fc684608ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-595ae42f-9ccc-4c41-8565-08fc684608ae
Content-Type: application/json

--- request body ---
{"handle":"qa-894141e83849","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-595ae42f-9ccc-4c41-8565-08fc684608ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f0b22c1-82df-4d76-8fcf-eb01e9a4724d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-770be2c9-3c04-4ddb-bfff-0476dd309471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-770be2c9-3c04-4ddb-bfff-0476dd309471
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-227953bc8111","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-770be2c9-3c04-4ddb-bfff-0476dd309471
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
Location: /v1/conversations/cnv_df09d0d4-e5da-46ad-90b8-8c4e25f1555e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_df09d0d4-e5da-46ad-90b8-8c4e25f1555e","subject":"Error contract","status":"open","region":"eu","participants":["qa-894141e83849","qa-227953bc8111"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:51.809181086Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-7d987c59-affb-4ae6-a462-7f62ea53f70d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d987c59-affb-4ae6-a462-7f62ea53f70d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d987c59-affb-4ae6-a462-7f62ea53f70d
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-7d987c59-affb-4ae6-a462-7f62ea53f70d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-66ada72c-45fa-4660-8016-85a1c4372dea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ada72c-45fa-4660-8016-85a1c4372dea
Content-Type: application/json

--- request body ---
{"handle":"qa-227953bc8111","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-66ada72c-45fa-4660-8016-85a1c4372dea
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d83ccac-891a-4b8b-8624-91ea16d6e398"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0327ff8d-4428-4301-991a-0dfa23d5ea66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0327ff8d-4428-4301-991a-0dfa23d5ea66
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0327ff8d-4428-4301-991a-0dfa23d5ea66
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
correlation: qa-14af49cd-5b3f-46d4-aca3-509a92457fae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14af49cd-5b3f-46d4-aca3-509a92457fae
Content-Type: application/json

--- request body ---
{"handle":"qa-227953bc8111","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14af49cd-5b3f-46d4-aca3-509a92457fae
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-14af49cd-5b3f-46d4-aca3-509a92457fae"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98e3de4f-1c52-4709-b11b-baab4d5baeba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e3de4f-1c52-4709-b11b-baab4d5baeba
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98e3de4f-1c52-4709-b11b-baab4d5baeba
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
correlation: qa-a18d8df4-5fc4-4cfc-84ef-aa009b110109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a18d8df4-5fc4-4cfc-84ef-aa009b110109
Content-Type: application/json

--- request body ---
{"handle":"qa-894141e83849","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a18d8df4-5fc4-4cfc-84ef-aa009b110109
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a18d8df4-5fc4-4cfc-84ef-aa009b110109"}
```
