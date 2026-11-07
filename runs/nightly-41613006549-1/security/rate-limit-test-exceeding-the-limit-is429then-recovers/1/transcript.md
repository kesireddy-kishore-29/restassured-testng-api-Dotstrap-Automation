# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 82 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 410 | `qa-036f25c8-e667-4957-af0f-448cff5e6533` |
| 2 | `POST /v1/auth/token` | 200 | 124 | `qa-8fdf7581-31e5-4b87-b3de-3cb26859ce75` |
| 3 | `GET /v1/accounts/me` | 200 | 35 | `qa-a0930eef-81ef-43f6-9ddc-dd6e79fb2329` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-86bbf395-558d-4f59-a0ea-348a2aa518b1` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-330e4266-76e7-4498-91d6-ff7cff8c632d` |
| 6 | `GET /v1/accounts/me` | 200 | 20 | `qa-7b26ce2d-e437-4241-8bfc-96124f640433` |
| 7 | `GET /v1/accounts/me` | 200 | 16 | `qa-413d260b-2ce7-4f98-a81b-90871eec7700` |
| 8 | `GET /v1/accounts/me` | 200 | 39 | `qa-486f4a91-779a-430d-95cf-846f995b1dcc` |
| 9 | `GET /v1/accounts/me` | 200 | 32 | `qa-c21b001d-ee69-44c8-9e8d-3cf94dd71d47` |
| 10 | `GET /v1/accounts/me` | 200 | 15 | `qa-fca1e6f0-73ab-410d-8445-8e7bf7edce14` |
| 11 | `GET /v1/accounts/me` | 200 | 15 | `qa-04ae010e-5651-4ade-9179-7436500f9f25` |
| 12 | `GET /v1/accounts/me` | 200 | 16 | `qa-90e8cc3d-4346-42c1-94b8-4baafc6187ef` |
| 13 | `GET /v1/accounts/me` | 200 | 17 | `qa-0ada5648-4d23-4958-a46c-bdba06de903e` |
| 14 | `GET /v1/accounts/me` | 200 | 16 | `qa-670bf57a-c741-4016-b414-c3860809f274` |
| 15 | `GET /v1/accounts/me` | 200 | 19 | `qa-c92bba07-0480-47d4-8ae3-7298c7691dca` |
| 16 | `GET /v1/accounts/me` | 200 | 16 | `qa-74039385-df9d-4891-88ba-17034cdb4743` |
| 17 | `GET /v1/accounts/me` | 200 | 8 | `qa-8308ecf5-6de6-454f-b929-f4f47183494d` |
| 18 | `GET /v1/accounts/me` | 200 | 10 | `qa-2fb87fa2-39b0-4873-9506-7a6faec68180` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-4262da1d-10b3-4202-86e7-9e397f252123` |
| 20 | `GET /v1/accounts/me` | 200 | 10 | `qa-206e9029-f55d-423f-9e1f-fc9672e7ae25` |
| 21 | `GET /v1/accounts/me` | 200 | 13 | `qa-87cff58e-c983-4e69-a349-611de6074f0d` |
| 22 | `GET /v1/accounts/me` | 200 | 8 | `qa-9311ebd7-b626-4fb4-ae4a-dfaf6f71e9a2` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-fab4877b-136e-4216-bfcf-a3b10109129c` |
| 24 | `GET /v1/accounts/me` | 200 | 9 | `qa-af285030-9989-4bb5-9d2d-1c97c8527423` |
| 25 | `GET /v1/accounts/me` | 200 | 8 | `qa-3f09850d-973d-492c-944b-53fa3d3818b1` |
| 26 | `GET /v1/accounts/me` | 200 | 7 | `qa-84004dd1-ae79-41ec-8789-ccc5219e40d0` |
| 27 | `GET /v1/accounts/me` | 200 | 7 | `qa-0dd6c34c-dac4-43b0-9b8a-620e2f8fc395` |
| 28 | `GET /v1/accounts/me` | 200 | 6 | `qa-29efad37-f5f8-4a10-a110-d8aef74d66ed` |
| 29 | `GET /v1/accounts/me` | 200 | 6 | `qa-7745edf7-f41c-4850-96d0-a5cc29e898b1` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-b8da73f4-bc33-4c18-803c-cad1c5e3aaa2` |
| 31 | `GET /v1/accounts/me` | 200 | 7 | `qa-a603d257-5df6-4448-b795-8f6fa489ecd1` |
| 32 | `GET /v1/accounts/me` | 200 | 6 | `qa-88662da3-83e7-4055-b9c6-9cdfd02a4c47` |
| 33 | `GET /v1/accounts/me` | 200 | 15 | `qa-18189a40-3ef3-407d-a70d-b8743f476c09` |
| 34 | `GET /v1/accounts/me` | 200 | 14 | `qa-6c05f341-9a90-4ca6-a40a-8beeb4f8aa56` |
| 35 | `GET /v1/accounts/me` | 200 | 14 | `qa-5e78a406-9a87-48b1-9cd2-e6d66b3a72cc` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-36539bc4-105b-4a21-b2c3-5231be14f5a5` |
| 37 | `GET /v1/accounts/me` | 200 | 10 | `qa-eec27eb7-6e2c-4f8c-b20d-864c9989bd7a` |
| 38 | `GET /v1/accounts/me` | 200 | 10 | `qa-8118fa46-6c71-4fac-9b90-4bd87993469a` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-76697bcc-52d3-4ea4-a3b9-d684c24659ba` |
| 40 | `GET /v1/accounts/me` | 200 | 7 | `qa-a79d2d3b-3c37-48ed-892b-be0b1d6ac3d9` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-6127ceb1-27b5-47a5-8805-6579bb2956dd` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-6d9b6f52-f080-43c9-8f6e-715428e0abbd` |
| 43 | `GET /v1/accounts/me` | 200 | 9 | `qa-758ff2a7-dc3a-4de6-8bac-3109923dc02a` |
| 44 | `GET /v1/accounts/me` | 200 | 15 | `qa-51b5a728-590b-4e6c-9b4c-e55b3aac1f23` |
| 45 | `GET /v1/accounts/me` | 200 | 15 | `qa-d531212f-9887-49f0-8e8b-4d36270db13a` |
| 46 | `GET /v1/accounts/me` | 200 | 13 | `qa-818a8b7a-34d5-4e60-88d6-b51fa3ccdc15` |
| 47 | `GET /v1/accounts/me` | 200 | 16 | `qa-085f5196-c6dd-481d-8612-f85c5219dc7e` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-69f6d736-7f18-45ef-872a-c289d045d14c` |
| 49 | `GET /v1/accounts/me` | 200 | 19 | `qa-d417f6b1-832b-4953-a958-103354ef4fc7` |
| 50 | `GET /v1/accounts/me` | 200 | 13 | `qa-f6489641-dd0a-4a95-b64f-430b4d16170e` |
| 51 | `GET /v1/accounts/me` | 200 | 4 | `qa-57b01e4c-756e-4b25-b52e-8338ae1c6a1f` |
| 52 | `GET /v1/accounts/me` | 200 | 9 | `qa-488d2d53-c09e-4730-b38e-1720e2c43408` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-67f57fa3-c177-4f28-af90-ec895faf3855` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-66a11403-d610-4c05-be3f-bfb897ec1985` |
| 55 | `GET /v1/accounts/me` | 200 | 4 | `qa-dd85bd3e-8661-46b3-b757-b36ba7200afc` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-d9693e48-7120-4f63-b2ba-0fe4a4462b1e` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-87f1df21-bcb7-46b7-8d1a-53d1ca89a1da` |
| 58 | `GET /v1/accounts/me` | 200 | 4 | `qa-2232e774-f115-448c-bf27-df7236b79c6e` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-93231727-afd3-4f51-9645-bf817bb2d77b` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-b732b7d6-8412-4dc7-ac03-888c1a5edc1d` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-e97b0547-a75e-4055-b454-d7f8b8f0adef` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-60fa7571-9707-4905-ab95-f35afa031a76` |
| 63 | `GET /v1/accounts/me` | 429 | 8 | `qa-42b0b1fc-089a-46d0-b51b-53367798935d` |
| 64 | `GET /v1/accounts/me` | 429 | 9 | `qa-c8f6947c-1c3b-44a2-a6af-d2a5a31a9fa5` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-83f484d4-d151-407b-b28f-dd976d57974d` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-e771ba0a-b47a-4507-961e-7a282facb3f7` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-bc1ac455-fdc3-4c73-89de-01e0c986647b` |
| 68 | `GET /v1/accounts/me` | 429 | 6 | `qa-c59f9f45-50e7-4e20-8ec0-52ae06f61eaf` |
| 69 | `GET /v1/accounts/me` | 429 | 5 | `qa-be25ce67-a60f-4e03-aba8-2c52e621854e` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-ab39f5eb-f8e2-4930-8c3b-fd42b6b0c6d3` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-44dc8b1f-d800-436f-a0c8-9bce4c6af4b9` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-4e301ae4-f52c-44b2-a1dc-599feb305395` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-8194b901-a6b2-43b5-8fab-f6bb0d1c8ef1` |
| 74 | `GET /v1/accounts/me` | 429 | 9 | `qa-5dad3b17-8e7a-409d-8ff5-98cd81c08fe9` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-3b542ed7-5992-40f5-816c-397aac48c1cf` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-9fe94b98-5a6e-4840-8e2b-2831d19e0542` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-49cf76c6-2319-4bfc-aa59-f6d14c6b930d` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-4b01b82c-79e4-42a3-90d4-1dbc9a5d949f` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-189178d0-db73-4a77-b4b9-f5057051ac09` |
| 80 | `GET /v1/accounts/me` | 200 | 3 | `qa-2fe47db8-b041-4c02-b613-403ba5fcee9b` |
| 81 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-3160e315-232b-41b5-ac1a-a01515a20352` |
| 82 | `POST /v1/auth/token` | 401 | 5 | `qa-9f7db0d3-c28f-43ba-84a7-e6c6596af033` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-036f25c8-e667-4957-af0f-448cff5e6533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-036f25c8-e667-4957-af0f-448cff5e6533
Content-Type: application/json

--- request body ---
{"handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","password":"****","region":"eu"}

--- response: 201 in 410 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-036f25c8-e667-4957-af0f-448cff5e6533
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-4ef20bdce349
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8fdf7581-31e5-4b87-b3de-3cb26859ce75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fdf7581-31e5-4b87-b3de-3cb26859ce75
Content-Type: application/json

--- request body ---
{"handle":"qa-4ef20bdce349","password":"****"}

--- response: 200 in 124 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fdf7581-31e5-4b87-b3de-3cb26859ce75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0930eef-81ef-43f6-9ddc-dd6e79fb2329

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0930eef-81ef-43f6-9ddc-dd6e79fb2329
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0930eef-81ef-43f6-9ddc-dd6e79fb2329
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
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-86bbf395-558d-4f59-a0ea-348a2aa518b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86bbf395-558d-4f59-a0ea-348a2aa518b1
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-86bbf395-558d-4f59-a0ea-348a2aa518b1
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
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-330e4266-76e7-4498-91d6-ff7cff8c632d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-330e4266-76e7-4498-91d6-ff7cff8c632d
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-330e4266-76e7-4498-91d6-ff7cff8c632d
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
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b26ce2d-e437-4241-8bfc-96124f640433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b26ce2d-e437-4241-8bfc-96124f640433
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b26ce2d-e437-4241-8bfc-96124f640433
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-413d260b-2ce7-4f98-a81b-90871eec7700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-413d260b-2ce7-4f98-a81b-90871eec7700
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-413d260b-2ce7-4f98-a81b-90871eec7700
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-486f4a91-779a-430d-95cf-846f995b1dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-486f4a91-779a-430d-95cf-846f995b1dcc
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-486f4a91-779a-430d-95cf-846f995b1dcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-c21b001d-ee69-44c8-9e8d-3cf94dd71d47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21b001d-ee69-44c8-9e8d-3cf94dd71d47
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c21b001d-ee69-44c8-9e8d-3cf94dd71d47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-fca1e6f0-73ab-410d-8445-8e7bf7edce14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fca1e6f0-73ab-410d-8445-8e7bf7edce14
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-fca1e6f0-73ab-410d-8445-8e7bf7edce14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-04ae010e-5651-4ade-9179-7436500f9f25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04ae010e-5651-4ade-9179-7436500f9f25
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-04ae010e-5651-4ade-9179-7436500f9f25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-90e8cc3d-4346-42c1-94b8-4baafc6187ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90e8cc3d-4346-42c1-94b8-4baafc6187ef
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-90e8cc3d-4346-42c1-94b8-4baafc6187ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ada5648-4d23-4958-a46c-bdba06de903e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ada5648-4d23-4958-a46c-bdba06de903e
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ada5648-4d23-4958-a46c-bdba06de903e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-670bf57a-c741-4016-b414-c3860809f274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-670bf57a-c741-4016-b414-c3860809f274
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-670bf57a-c741-4016-b414-c3860809f274
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-c92bba07-0480-47d4-8ae3-7298c7691dca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c92bba07-0480-47d4-8ae3-7298c7691dca
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c92bba07-0480-47d4-8ae3-7298c7691dca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-74039385-df9d-4891-88ba-17034cdb4743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74039385-df9d-4891-88ba-17034cdb4743
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-74039385-df9d-4891-88ba-17034cdb4743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-8308ecf5-6de6-454f-b929-f4f47183494d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8308ecf5-6de6-454f-b929-f4f47183494d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8308ecf5-6de6-454f-b929-f4f47183494d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fb87fa2-39b0-4873-9506-7a6faec68180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fb87fa2-39b0-4873-9506-7a6faec68180
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fb87fa2-39b0-4873-9506-7a6faec68180
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-4262da1d-10b3-4202-86e7-9e397f252123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4262da1d-10b3-4202-86e7-9e397f252123
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-4262da1d-10b3-4202-86e7-9e397f252123
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-206e9029-f55d-423f-9e1f-fc9672e7ae25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-206e9029-f55d-423f-9e1f-fc9672e7ae25
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-206e9029-f55d-423f-9e1f-fc9672e7ae25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-87cff58e-c983-4e69-a349-611de6074f0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87cff58e-c983-4e69-a349-611de6074f0d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-87cff58e-c983-4e69-a349-611de6074f0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-9311ebd7-b626-4fb4-ae4a-dfaf6f71e9a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9311ebd7-b626-4fb4-ae4a-dfaf6f71e9a2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-9311ebd7-b626-4fb4-ae4a-dfaf6f71e9a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-fab4877b-136e-4216-bfcf-a3b10109129c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab4877b-136e-4216-bfcf-a3b10109129c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-fab4877b-136e-4216-bfcf-a3b10109129c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-af285030-9989-4bb5-9d2d-1c97c8527423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af285030-9989-4bb5-9d2d-1c97c8527423
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-af285030-9989-4bb5-9d2d-1c97c8527423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f09850d-973d-492c-944b-53fa3d3818b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f09850d-973d-492c-944b-53fa3d3818b1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f09850d-973d-492c-944b-53fa3d3818b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-84004dd1-ae79-41ec-8789-ccc5219e40d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84004dd1-ae79-41ec-8789-ccc5219e40d0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-84004dd1-ae79-41ec-8789-ccc5219e40d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-0dd6c34c-dac4-43b0-9b8a-620e2f8fc395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dd6c34c-dac4-43b0-9b8a-620e2f8fc395
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dd6c34c-dac4-43b0-9b8a-620e2f8fc395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-29efad37-f5f8-4a10-a110-d8aef74d66ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29efad37-f5f8-4a10-a110-d8aef74d66ed
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-29efad37-f5f8-4a10-a110-d8aef74d66ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-7745edf7-f41c-4850-96d0-a5cc29e898b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7745edf7-f41c-4850-96d0-a5cc29e898b1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7745edf7-f41c-4850-96d0-a5cc29e898b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8da73f4-bc33-4c18-803c-cad1c5e3aaa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8da73f4-bc33-4c18-803c-cad1c5e3aaa2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8da73f4-bc33-4c18-803c-cad1c5e3aaa2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-a603d257-5df6-4448-b795-8f6fa489ecd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a603d257-5df6-4448-b795-8f6fa489ecd1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a603d257-5df6-4448-b795-8f6fa489ecd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-88662da3-83e7-4055-b9c6-9cdfd02a4c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88662da3-83e7-4055-b9c6-9cdfd02a4c47
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-88662da3-83e7-4055-b9c6-9cdfd02a4c47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-18189a40-3ef3-407d-a70d-b8743f476c09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18189a40-3ef3-407d-a70d-b8743f476c09
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-18189a40-3ef3-407d-a70d-b8743f476c09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c05f341-9a90-4ca6-a40a-8beeb4f8aa56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c05f341-9a90-4ca6-a40a-8beeb4f8aa56
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c05f341-9a90-4ca6-a40a-8beeb4f8aa56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e78a406-9a87-48b1-9cd2-e6d66b3a72cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e78a406-9a87-48b1-9cd2-e6d66b3a72cc
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e78a406-9a87-48b1-9cd2-e6d66b3a72cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-36539bc4-105b-4a21-b2c3-5231be14f5a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36539bc4-105b-4a21-b2c3-5231be14f5a5
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-36539bc4-105b-4a21-b2c3-5231be14f5a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-eec27eb7-6e2c-4f8c-b20d-864c9989bd7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eec27eb7-6e2c-4f8c-b20d-864c9989bd7a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-eec27eb7-6e2c-4f8c-b20d-864c9989bd7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-8118fa46-6c71-4fac-9b90-4bd87993469a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8118fa46-6c71-4fac-9b90-4bd87993469a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8118fa46-6c71-4fac-9b90-4bd87993469a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-76697bcc-52d3-4ea4-a3b9-d684c24659ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76697bcc-52d3-4ea4-a3b9-d684c24659ba
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-76697bcc-52d3-4ea4-a3b9-d684c24659ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-a79d2d3b-3c37-48ed-892b-be0b1d6ac3d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a79d2d3b-3c37-48ed-892b-be0b1d6ac3d9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a79d2d3b-3c37-48ed-892b-be0b1d6ac3d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-6127ceb1-27b5-47a5-8805-6579bb2956dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6127ceb1-27b5-47a5-8805-6579bb2956dd
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6127ceb1-27b5-47a5-8805-6579bb2956dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d9b6f52-f080-43c9-8f6e-715428e0abbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d9b6f52-f080-43c9-8f6e-715428e0abbd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d9b6f52-f080-43c9-8f6e-715428e0abbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-758ff2a7-dc3a-4de6-8bac-3109923dc02a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-758ff2a7-dc3a-4de6-8bac-3109923dc02a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-758ff2a7-dc3a-4de6-8bac-3109923dc02a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-51b5a728-590b-4e6c-9b4c-e55b3aac1f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b5a728-590b-4e6c-9b4c-e55b3aac1f23
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-51b5a728-590b-4e6c-9b4c-e55b3aac1f23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-d531212f-9887-49f0-8e8b-4d36270db13a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d531212f-9887-49f0-8e8b-4d36270db13a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d531212f-9887-49f0-8e8b-4d36270db13a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-818a8b7a-34d5-4e60-88d6-b51fa3ccdc15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-818a8b7a-34d5-4e60-88d6-b51fa3ccdc15
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-818a8b7a-34d5-4e60-88d6-b51fa3ccdc15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-085f5196-c6dd-481d-8612-f85c5219dc7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-085f5196-c6dd-481d-8612-f85c5219dc7e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-085f5196-c6dd-481d-8612-f85c5219dc7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-69f6d736-7f18-45ef-872a-c289d045d14c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69f6d736-7f18-45ef-872a-c289d045d14c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-69f6d736-7f18-45ef-872a-c289d045d14c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-d417f6b1-832b-4953-a958-103354ef4fc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d417f6b1-832b-4953-a958-103354ef4fc7
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d417f6b1-832b-4953-a958-103354ef4fc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6489641-dd0a-4a95-b64f-430b4d16170e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6489641-dd0a-4a95-b64f-430b4d16170e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6489641-dd0a-4a95-b64f-430b4d16170e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-57b01e4c-756e-4b25-b52e-8338ae1c6a1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57b01e4c-756e-4b25-b52e-8338ae1c6a1f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-57b01e4c-756e-4b25-b52e-8338ae1c6a1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-488d2d53-c09e-4730-b38e-1720e2c43408

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-488d2d53-c09e-4730-b38e-1720e2c43408
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-488d2d53-c09e-4730-b38e-1720e2c43408
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-67f57fa3-c177-4f28-af90-ec895faf3855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67f57fa3-c177-4f28-af90-ec895faf3855
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-67f57fa3-c177-4f28-af90-ec895faf3855
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-66a11403-d610-4c05-be3f-bfb897ec1985

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a11403-d610-4c05-be3f-bfb897ec1985
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-66a11403-d610-4c05-be3f-bfb897ec1985
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd85bd3e-8661-46b3-b757-b36ba7200afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd85bd3e-8661-46b3-b757-b36ba7200afc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd85bd3e-8661-46b3-b757-b36ba7200afc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9693e48-7120-4f63-b2ba-0fe4a4462b1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9693e48-7120-4f63-b2ba-0fe4a4462b1e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9693e48-7120-4f63-b2ba-0fe4a4462b1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-87f1df21-bcb7-46b7-8d1a-53d1ca89a1da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87f1df21-bcb7-46b7-8d1a-53d1ca89a1da
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-87f1df21-bcb7-46b7-8d1a-53d1ca89a1da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-2232e774-f115-448c-bf27-df7236b79c6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2232e774-f115-448c-bf27-df7236b79c6e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-2232e774-f115-448c-bf27-df7236b79c6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-93231727-afd3-4f51-9645-bf817bb2d77b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93231727-afd3-4f51-9645-bf817bb2d77b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-93231727-afd3-4f51-9645-bf817bb2d77b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-b732b7d6-8412-4dc7-ac03-888c1a5edc1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b732b7d6-8412-4dc7-ac03-888c1a5edc1d
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-b732b7d6-8412-4dc7-ac03-888c1a5edc1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-e97b0547-a75e-4055-b454-d7f8b8f0adef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e97b0547-a75e-4055-b454-d7f8b8f0adef
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-e97b0547-a75e-4055-b454-d7f8b8f0adef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-60fa7571-9707-4905-ab95-f35afa031a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60fa7571-9707-4905-ab95-f35afa031a76
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-60fa7571-9707-4905-ab95-f35afa031a76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-42b0b1fc-089a-46d0-b51b-53367798935d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42b0b1fc-089a-46d0-b51b-53367798935d
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42b0b1fc-089a-46d0-b51b-53367798935d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-42b0b1fc-089a-46d0-b51b-53367798935d"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8f6947c-1c3b-44a2-a6af-d2a5a31a9fa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8f6947c-1c3b-44a2-a6af-d2a5a31a9fa5
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8f6947c-1c3b-44a2-a6af-d2a5a31a9fa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c8f6947c-1c3b-44a2-a6af-d2a5a31a9fa5"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-83f484d4-d151-407b-b28f-dd976d57974d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83f484d4-d151-407b-b28f-dd976d57974d
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83f484d4-d151-407b-b28f-dd976d57974d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-83f484d4-d151-407b-b28f-dd976d57974d"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-e771ba0a-b47a-4507-961e-7a282facb3f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e771ba0a-b47a-4507-961e-7a282facb3f7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e771ba0a-b47a-4507-961e-7a282facb3f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e771ba0a-b47a-4507-961e-7a282facb3f7"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc1ac455-fdc3-4c73-89de-01e0c986647b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc1ac455-fdc3-4c73-89de-01e0c986647b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc1ac455-fdc3-4c73-89de-01e0c986647b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bc1ac455-fdc3-4c73-89de-01e0c986647b"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-c59f9f45-50e7-4e20-8ec0-52ae06f61eaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59f9f45-50e7-4e20-8ec0-52ae06f61eaf
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c59f9f45-50e7-4e20-8ec0-52ae06f61eaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c59f9f45-50e7-4e20-8ec0-52ae06f61eaf"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-be25ce67-a60f-4e03-aba8-2c52e621854e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be25ce67-a60f-4e03-aba8-2c52e621854e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be25ce67-a60f-4e03-aba8-2c52e621854e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-be25ce67-a60f-4e03-aba8-2c52e621854e"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab39f5eb-f8e2-4930-8c3b-fd42b6b0c6d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab39f5eb-f8e2-4930-8c3b-fd42b6b0c6d3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab39f5eb-f8e2-4930-8c3b-fd42b6b0c6d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ab39f5eb-f8e2-4930-8c3b-fd42b6b0c6d3"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-44dc8b1f-d800-436f-a0c8-9bce4c6af4b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44dc8b1f-d800-436f-a0c8-9bce4c6af4b9
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44dc8b1f-d800-436f-a0c8-9bce4c6af4b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-44dc8b1f-d800-436f-a0c8-9bce4c6af4b9"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e301ae4-f52c-44b2-a1dc-599feb305395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e301ae4-f52c-44b2-a1dc-599feb305395
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e301ae4-f52c-44b2-a1dc-599feb305395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4e301ae4-f52c-44b2-a1dc-599feb305395"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-8194b901-a6b2-43b5-8fab-f6bb0d1c8ef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8194b901-a6b2-43b5-8fab-f6bb0d1c8ef1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8194b901-a6b2-43b5-8fab-f6bb0d1c8ef1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8194b901-a6b2-43b5-8fab-f6bb0d1c8ef1"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-5dad3b17-8e7a-409d-8ff5-98cd81c08fe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dad3b17-8e7a-409d-8ff5-98cd81c08fe9
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5dad3b17-8e7a-409d-8ff5-98cd81c08fe9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5dad3b17-8e7a-409d-8ff5-98cd81c08fe9"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b542ed7-5992-40f5-816c-397aac48c1cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b542ed7-5992-40f5-816c-397aac48c1cf
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b542ed7-5992-40f5-816c-397aac48c1cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3b542ed7-5992-40f5-816c-397aac48c1cf"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fe94b98-5a6e-4840-8e2b-2831d19e0542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fe94b98-5a6e-4840-8e2b-2831d19e0542
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fe94b98-5a6e-4840-8e2b-2831d19e0542
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9fe94b98-5a6e-4840-8e2b-2831d19e0542"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-49cf76c6-2319-4bfc-aa59-f6d14c6b930d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49cf76c6-2319-4bfc-aa59-f6d14c6b930d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49cf76c6-2319-4bfc-aa59-f6d14c6b930d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-49cf76c6-2319-4bfc-aa59-f6d14c6b930d"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b01b82c-79e4-42a3-90d4-1dbc9a5d949f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b01b82c-79e4-42a3-90d4-1dbc9a5d949f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b01b82c-79e4-42a3-90d4-1dbc9a5d949f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4b01b82c-79e4-42a3-90d4-1dbc9a5d949f"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-189178d0-db73-4a77-b4b9-f5057051ac09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-189178d0-db73-4a77-b4b9-f5057051ac09
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-189178d0-db73-4a77-b4b9-f5057051ac09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-189178d0-db73-4a77-b4b9-f5057051ac09"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fe47db8-b041-4c02-b613-403ba5fcee9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fe47db8-b041-4c02-b613-403ba5fcee9b
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fe47db8-b041-4c02-b613-403ba5fcee9b
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
Content-Length: 181

{"id":"acc_8778a6e5-2b06-4233-b25d-ae6fd3f94bd4","handle":"qa-4ef20bdce349","displayName":"QA 4ef20bdce349","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.194070863Z"}
```

## 81. DELETE /v1/accounts/me

```text
#81 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3160e315-232b-41b5-ac1a-a01515a20352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3160e315-232b-41b5-ac1a-a01515a20352
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3160e315-232b-41b5-ac1a-a01515a20352
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

## 82. POST /v1/auth/token

```text
#82 POST http://localhost:7070/v1/auth/token
correlation: qa-9f7db0d3-c28f-43ba-84a7-e6c6596af033

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f7db0d3-c28f-43ba-84a7-e6c6596af033
Content-Type: application/json

--- request body ---
{"handle":"qa-4ef20bdce349","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f7db0d3-c28f-43ba-84a7-e6c6596af033
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f7db0d3-c28f-43ba-84a7-e6c6596af033"}
```
