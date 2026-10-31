# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-2fc38090-0fce-4496-ab74-60371ab02f0a` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-d83cd857-c401-4fdf-b822-d2c3d0d40131` |
| 3 | `POST /v1/accounts` | 201 | 13 | `qa-319a431c-2c83-4e9e-9afe-1c54217ded51` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-71059bfb-a0e1-4bd0-94c9-0ea655366cf9` |
| 5 | `POST /v1/conversations` | 201 | 19 | `qa-29d17925-fc7f-43af-9908-1f1348a2b87f` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-34eef509-f168-4c9d-8557-ec658447bc2f` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 16 | `qa-25463022-8406-417e-b89c-a1c2894422e0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-efe38526-a9e9-4713-aca7-8c8fa1324059` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-d616aac9-9091-4f6d-8aab-1dea088c6d31` |
| 10 | `POST /v1/auth/token` | 200 | 23 | `qa-f07f5e20-31d7-438e-913a-21f0c1719fbf` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-0ae5fda3-8d59-4a3a-bea9-5f7a8c7f162f` |
| 12 | `POST /v1/auth/token` | 401 | 21 | `qa-416dd2c0-74ad-4af6-9f8e-54cc2350bb2c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-707e3db9-9a8c-4815-adb2-440497e26281` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-9d650daf-765d-49ed-aa90-b6e18020a58a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2fc38090-0fce-4496-ab74-60371ab02f0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fc38090-0fce-4496-ab74-60371ab02f0a
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc0b82d1d37","displayName":"QA bbc0b82d1d37","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fc38090-0fce-4496-ab74-60371ab02f0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-bbc0b82d1d37
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f584db79-a3ab-458a-87ff-75d0a2771956","handle":"qa-bbc0b82d1d37","displayName":"QA bbc0b82d1d37","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.852991331Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d83cd857-c401-4fdf-b822-d2c3d0d40131

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d83cd857-c401-4fdf-b822-d2c3d0d40131
Content-Type: application/json

--- request body ---
{"handle":"qa-06a4f17b3bdc","displayName":"QA 06a4f17b3bdc","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d83cd857-c401-4fdf-b822-d2c3d0d40131
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Location: /v1/accounts/qa-06a4f17b3bdc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4559cab-a975-42e4-90cd-5061febbf065","handle":"qa-06a4f17b3bdc","displayName":"QA 06a4f17b3bdc","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.887652023Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-319a431c-2c83-4e9e-9afe-1c54217ded51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-319a431c-2c83-4e9e-9afe-1c54217ded51
Content-Type: application/json

--- request body ---
{"handle":"qa-8d4a8500d1c5","displayName":"QA 8d4a8500d1c5","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-319a431c-2c83-4e9e-9afe-1c54217ded51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-8d4a8500d1c5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a6a910b-a29d-4d18-bda8-5b13bd1dfbac","handle":"qa-8d4a8500d1c5","displayName":"QA 8d4a8500d1c5","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.940374369Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-71059bfb-a0e1-4bd0-94c9-0ea655366cf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71059bfb-a0e1-4bd0-94c9-0ea655366cf9
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc0b82d1d37","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-71059bfb-a0e1-4bd0-94c9-0ea655366cf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f584db79-a3ab-458a-87ff-75d0a2771956"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-29d17925-fc7f-43af-9908-1f1348a2b87f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29d17925-fc7f-43af-9908-1f1348a2b87f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-06a4f17b3bdc","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-29d17925-fc7f-43af-9908-1f1348a2b87f
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
Location: /v1/conversations/cnv_b2df4e4b-85a6-4c42-ae53-27fffd9be023
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b2df4e4b-85a6-4c42-ae53-27fffd9be023","subject":"Error contract","status":"open","region":"eu","participants":["qa-bbc0b82d1d37","qa-06a4f17b3bdc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.011965055Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-34eef509-f168-4c9d-8557-ec658447bc2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34eef509-f168-4c9d-8557-ec658447bc2f
Content-Type: application/json

--- request body ---
{"handle":"qa-8d4a8500d1c5","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-34eef509-f168-4c9d-8557-ec658447bc2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a6a910b-a29d-4d18-bda8-5b13bd1dfbac"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b2df4e4b-85a6-4c42-ae53-27fffd9be023/messages
correlation: qa-25463022-8406-417e-b89c-a1c2894422e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25463022-8406-417e-b89c-a1c2894422e0
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25463022-8406-417e-b89c-a1c2894422e0
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b2df4e4b-85a6-4c42-ae53-27fffd9be023/messages","correlationId":"qa-25463022-8406-417e-b89c-a1c2894422e0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-efe38526-a9e9-4713-aca7-8c8fa1324059

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efe38526-a9e9-4713-aca7-8c8fa1324059
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-efe38526-a9e9-4713-aca7-8c8fa1324059
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-d616aac9-9091-4f6d-8aab-1dea088c6d31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d616aac9-9091-4f6d-8aab-1dea088c6d31
Content-Type: application/json

--- request body ---
{"handle":"qa-8d4a8500d1c5","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d616aac9-9091-4f6d-8aab-1dea088c6d31
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d616aac9-9091-4f6d-8aab-1dea088c6d31"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f07f5e20-31d7-438e-913a-21f0c1719fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f07f5e20-31d7-438e-913a-21f0c1719fbf
Content-Type: application/json

--- request body ---
{"handle":"qa-06a4f17b3bdc","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f07f5e20-31d7-438e-913a-21f0c1719fbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4559cab-a975-42e4-90cd-5061febbf065"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ae5fda3-8d59-4a3a-bea9-5f7a8c7f162f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ae5fda3-8d59-4a3a-bea9-5f7a8c7f162f
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ae5fda3-8d59-4a3a-bea9-5f7a8c7f162f
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-416dd2c0-74ad-4af6-9f8e-54cc2350bb2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-416dd2c0-74ad-4af6-9f8e-54cc2350bb2c
Content-Type: application/json

--- request body ---
{"handle":"qa-06a4f17b3bdc","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-416dd2c0-74ad-4af6-9f8e-54cc2350bb2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-416dd2c0-74ad-4af6-9f8e-54cc2350bb2c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-707e3db9-9a8c-4815-adb2-440497e26281

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-707e3db9-9a8c-4815-adb2-440497e26281
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-707e3db9-9a8c-4815-adb2-440497e26281
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-9d650daf-765d-49ed-aa90-b6e18020a58a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d650daf-765d-49ed-aa90-b6e18020a58a
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc0b82d1d37","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d650daf-765d-49ed-aa90-b6e18020a58a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d650daf-765d-49ed-aa90-b6e18020a58a"}
```
