# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-e28aa70b-b713-4bcb-bc8b-beb1d8e21b7e` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-59d2c0e6-6f80-48e4-ba59-bfb55720f013` |
| 3 | `POST /v1/accounts` | 201 | 40 | `qa-359db9c0-a462-46b5-83ab-28dbfda89858` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-69cb16c9-ef0c-49f7-a961-7223725d20c1` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-9a7dee7b-f07d-4e50-849f-b76d16ca5da6` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-79bd6a05-2af1-47be-b4f0-2261296dea4d` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 18 | `qa-4df253d2-0d02-4d38-bd09-189b164f83d2` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-f3397e44-df4a-4b8a-ad5b-edc568038229` |
| 9 | `POST /v1/auth/token` | 401 | 26 | `qa-88661fe2-f7d5-4f3f-8427-a716e19bafc2` |
| 10 | `POST /v1/auth/token` | 200 | 61 | `qa-e8deeb74-3ce8-401e-bd19-bba2918bf0b1` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-54b77297-edc5-4a15-9b06-36a4e2cb0ebf` |
| 12 | `POST /v1/auth/token` | 401 | 40 | `qa-4a1539f0-a011-4308-b906-8ce8ebcffa4b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-f495598f-47bc-4855-97a1-4cdf2572d583` |
| 14 | `POST /v1/auth/token` | 401 | 25 | `qa-372b127a-a886-450c-a0f2-1043f873d066` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e28aa70b-b713-4bcb-bc8b-beb1d8e21b7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e28aa70b-b713-4bcb-bc8b-beb1d8e21b7e
Content-Type: application/json

--- request body ---
{"handle":"qa-b0b7bfaadc85","displayName":"QA b0b7bfaadc85","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e28aa70b-b713-4bcb-bc8b-beb1d8e21b7e
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
Location: /v1/accounts/qa-b0b7bfaadc85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45ee1843-4c6c-42f3-828d-5dd666b05ba4","handle":"qa-b0b7bfaadc85","displayName":"QA b0b7bfaadc85","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.523965788Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-59d2c0e6-6f80-48e4-ba59-bfb55720f013

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59d2c0e6-6f80-48e4-ba59-bfb55720f013
Content-Type: application/json

--- request body ---
{"handle":"qa-8c97342668e7","displayName":"QA 8c97342668e7","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-59d2c0e6-6f80-48e4-ba59-bfb55720f013
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-8c97342668e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9ab0e1a-3f69-4cc7-a6f5-fb1b79ad3781","handle":"qa-8c97342668e7","displayName":"QA 8c97342668e7","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.543567698Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-359db9c0-a462-46b5-83ab-28dbfda89858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-359db9c0-a462-46b5-83ab-28dbfda89858
Content-Type: application/json

--- request body ---
{"handle":"qa-99afeef5e561","displayName":"QA 99afeef5e561","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-359db9c0-a462-46b5-83ab-28dbfda89858
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-99afeef5e561
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d2846057-de01-4e9d-9403-980b4431da40","handle":"qa-99afeef5e561","displayName":"QA 99afeef5e561","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.627050616Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-69cb16c9-ef0c-49f7-a961-7223725d20c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69cb16c9-ef0c-49f7-a961-7223725d20c1
Content-Type: application/json

--- request body ---
{"handle":"qa-b0b7bfaadc85","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-69cb16c9-ef0c-49f7-a961-7223725d20c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45ee1843-4c6c-42f3-828d-5dd666b05ba4"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9a7dee7b-f07d-4e50-849f-b76d16ca5da6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a7dee7b-f07d-4e50-849f-b76d16ca5da6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8c97342668e7","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a7dee7b-f07d-4e50-849f-b76d16ca5da6
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
Location: /v1/conversations/cnv_f3d48cb0-1737-4a2e-985d-44e02a479d76
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3d48cb0-1737-4a2e-985d-44e02a479d76","subject":"Error contract","status":"open","region":"eu","participants":["qa-b0b7bfaadc85","qa-8c97342668e7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.700519794Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-79bd6a05-2af1-47be-b4f0-2261296dea4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79bd6a05-2af1-47be-b4f0-2261296dea4d
Content-Type: application/json

--- request body ---
{"handle":"qa-99afeef5e561","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-79bd6a05-2af1-47be-b4f0-2261296dea4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d2846057-de01-4e9d-9403-980b4431da40"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f3d48cb0-1737-4a2e-985d-44e02a479d76/read
correlation: qa-4df253d2-0d02-4d38-bd09-189b164f83d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4df253d2-0d02-4d38-bd09-189b164f83d2
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4df253d2-0d02-4d38-bd09-189b164f83d2
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f3d48cb0-1737-4a2e-985d-44e02a479d76/read","correlationId":"qa-4df253d2-0d02-4d38-bd09-189b164f83d2"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3397e44-df4a-4b8a-ad5b-edc568038229

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3397e44-df4a-4b8a-ad5b-edc568038229
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3397e44-df4a-4b8a-ad5b-edc568038229
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
correlation: qa-88661fe2-f7d5-4f3f-8427-a716e19bafc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88661fe2-f7d5-4f3f-8427-a716e19bafc2
Content-Type: application/json

--- request body ---
{"handle":"qa-99afeef5e561","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88661fe2-f7d5-4f3f-8427-a716e19bafc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-88661fe2-f7d5-4f3f-8427-a716e19bafc2"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e8deeb74-3ce8-401e-bd19-bba2918bf0b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8deeb74-3ce8-401e-bd19-bba2918bf0b1
Content-Type: application/json

--- request body ---
{"handle":"qa-8c97342668e7","password":"****"}

--- response: 200 in 61 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8deeb74-3ce8-401e-bd19-bba2918bf0b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9ab0e1a-3f69-4cc7-a6f5-fb1b79ad3781"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54b77297-edc5-4a15-9b06-36a4e2cb0ebf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54b77297-edc5-4a15-9b06-36a4e2cb0ebf
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54b77297-edc5-4a15-9b06-36a4e2cb0ebf
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
correlation: qa-4a1539f0-a011-4308-b906-8ce8ebcffa4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a1539f0-a011-4308-b906-8ce8ebcffa4b
Content-Type: application/json

--- request body ---
{"handle":"qa-8c97342668e7","password":"****"}

--- response: 401 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a1539f0-a011-4308-b906-8ce8ebcffa4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a1539f0-a011-4308-b906-8ce8ebcffa4b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f495598f-47bc-4855-97a1-4cdf2572d583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f495598f-47bc-4855-97a1-4cdf2572d583
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f495598f-47bc-4855-97a1-4cdf2572d583
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-372b127a-a886-450c-a0f2-1043f873d066

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-372b127a-a886-450c-a0f2-1043f873d066
Content-Type: application/json

--- request body ---
{"handle":"qa-b0b7bfaadc85","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-372b127a-a886-450c-a0f2-1043f873d066
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-372b127a-a886-450c-a0f2-1043f873d066"}
```
